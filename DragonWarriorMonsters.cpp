#include<iostream>
#include<stdlib.h>
#include<time.h>
#include<cmath>
#include<math.h>
#include<vector>
#include<string>
using namespace std;
class Move{
	
	
	
};
class Monster{
	private:
	string name="";
	int level=1;
	double maxHitPoints=0;
	double maxMagicPoints=0;
	double hitPoints=0;
	double magicPoints=0;
	double experience=0;
	double physicalAttack=0;
	double physicalDefense=0;
	double speed=0;
	double specialAttack=0;
	double specialDefense=0;
	int hitPointGrowth=0;
	int magicPointGrowth=0;
	double experiencePointGrowth=0;
	int physicalAttackGrowth=0;
	int physicalDefenseGrowth=0;
	int speedGrowth=0;
	int specialAttackGrowth=0;
	int specialDefenseGrowth=0;
	vector<Move *> moveSet;
	public:
	string getName(){
		return name;
	}
	double getMaxHitPoints(){
		return maxHitPoints;
	}
	double getMaxMagicPoints(){
		return maxMagicPoints;
	};
	double getHitPoints(){
		return hitPoints;
	}
	double getExperience(){
		return experience;
	}
	double getLevel(){
		return level;
	};
	double getPhysicalAttack(){
		return physicalAttack;
	}
	double getPhysicalDefense(){
		return physicalDefense;
	}
	double getSpeed(){
		return speed;
	}
	double getSpecialAttack(){
		return specialAttack;
	}
	double getSpecialDefense(){
		return specialDefense;
	}
	void setName(string monsterName){
		name=monsterName;
	}
	void setMaxMagicPoints(int maxMagicPoints){
		this->maxMagicPoints=maxMagicPoints;
	}
	void setMaxHitPoints(int maxHitPoints){
		this->maxHitPoints=maxHitPoints;
	}
	void setHitPoints(int hitPoints){
		this->hitPoints=hitPoints;
	}
	void setMagicPoints(int magicPoints){
		this->magicPoints=magicPoints;
	}
	void setLevel(int level){
		for(int i=0;i<level;i++){
			levelUp();
		}
	}
	void setPhysicalAttack(int physicalAttack){
		this->physicalAttack=physicalAttack;
	}
	void setPhysicalDefense(int physicalDefense){
		this->physicalDefense=physicalDefense;
	}
	void setSpeed(int speed){
		this->speed=speed;
	}
	void  setSpecialAttack(int specialAttack){
		this->specialAttack=specialAttack;
	}
	void setSpecialDefense(int specialDefense){
		this->specialDefense=specialDefense;
	}
	void setHitPointGrowth(int hitPointGrowth){
		this->hitPointGrowth=100*maxHitPoints/hitPointGrowth;
	}
	void setMagicPointGrowth(int magicPointGrowth){
		this->magicPointGrowth=100*maxMagicPoints/magicPointGrowth;
	}
	void setExperiencePointGrowth(int experiencePointGrowth){
		this->experiencePointGrowth=experiencePointGrowth/100;
	}
	void setPhysicalAttackGrowth(int physicalAttackGrowth){
		this->physicalAttackGrowth=100*physicalAttack/physicalAttackGrowth;
	}
	void setPhysicalDefenseGrowth(int physicalDefenseGrowth){
		this->physicalDefenseGrowth=100*physicalDefense/physicalDefenseGrowth;
	}
	void setSpeedGrowth(int speedGrowth){
		this->speedGrowth=100*speed/speedGrowth;
	}
	void setSpecialAttackGrowth(int specialAttackGrowth){
		this->specialAttackGrowth=100*specialAttack/specialAttackGrowth;
	}
	void setSpecialDefenseGrowth(int specialDefenseGrowth){
		this->specialDefenseGrowth=100*specialDefense/specialDefenseGrowth;
	}
	double getDamageRecieved(Monster * monster){
		double damageRecieved=(monster->physicalAttack-physicalDefense/2+((monster->physicalAttack-physicalDefense/2+1)*(rand()%256))/256)/4;
		damageRecieved=ceil(damageRecieved);
		if(damageRecieved<=0.0){
			damageRecieved=0;
		}
		hitPoints-=damageRecieved;
		return ceil(damageRecieved);
	}
	double getExperiencePointsRecieved(Monster * monster){
		experience+=monster->level/monster->experiencePointGrowth*experiencePointGrowth;
		return experience;
	}
	bool checkIfAlive(){
		return hitPoints>0.0;
	}
	void levelUp(){
		level++;
		maxHitPoints=ceil(hitPointGrowth*log(level));
		maxMagicPoints=ceil(magicPointGrowth*log(level));
		physicalAttack=ceil(physicalAttackGrowth*log(level));
		physicalDefense=ceil(physicalDefenseGrowth*log(level));
		speed=ceil(speedGrowth*log(level+1));
		specialAttack=ceil(specialAttackGrowth*log(level));
		specialDefense=ceil(specialDefenseGrowth*log(level));
	}
	 bool checkIfLeveledUp(){
		if(level*level/experiencePointGrowth>=experience){
			experience=experience-level*level/experiencePointGrowth;
			experience=floor(experience);
			levelUp();
			return true;
		}
		return false;
	}
	
	
};
class Slime:public Monster{
	public:
		Slime(){
			setName("Slime");
			setMaxHitPoints(3);
			setMaxMagicPoints(2);
			setHitPoints(3);
			setMagicPoints(2);
			setPhysicalAttack(1);
			setPhysicalDefense(1);
			setSpeed(4);
			setSpecialAttack(3);
			setSpecialDefense(2);
			setHitPointGrowth(50);
			setMagicPointGrowth(50);
			setExperiencePointGrowth(100);
			setPhysicalAttackGrowth(50);
			setPhysicalDefenseGrowth(50);
			setSpeedGrowth(50);
			setSpecialAttackGrowth(50);
			setSpecialDefenseGrowth(50);
		}
	
};

int main(){
	Monster * slime1=new Slime();
	Monster * enemySlime=new Slime();
		enemySlime->setHitPoints(3);
		slime1->setLevel(50);
		enemySlime->setLevel(100);
		enemySlime->setHitPoints(enemySlime->getMaxHitPoints());
		cout<<enemySlime->getHitPoints()<<endl;
		string s;
		while(enemySlime->checkIfAlive()){
				srand(time(NULL));
					cout<<" Before:"<<enemySlime->getHitPoints()<<endl;
			cout<<enemySlime->getDamageRecieved(slime1)<<endl;
			cout<<"After:"<<enemySlime->getHitPoints()<<endl;
			cout<<"What do you want to do?"<<endl;
			cin>>s;
		}
		cout<<"Experience Received: "<<slime1->getExperiencePointsRecieved(enemySlime)<<endl;
	
}
