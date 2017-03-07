/**
 * Created by Wendy Yovaish on 3/5/2017.
 */
public class MonsterFactory {
    public static Monster createMonster(int monsterName){
        Monster monsterToBeCreated=new Monster();
        if(monsterName==MonsterInfo.Slime){
            monsterToBeCreated.setMonsterName("Slime");
        monsterToBeCreated.setMaxHP(7);
        monsterToBeCreated.setCurrentHP(7);
        monsterToBeCreated.setMaxMP(4);
        monsterToBeCreated.setCurrentMP(4);
        monsterToBeCreated.setPhysicalAttack(5);
        monsterToBeCreated.setPhysicalDefense(3);
        monsterToBeCreated.setSpecialDefense(2);
        monsterToBeCreated.setSpecialAttack(3);
        monsterToBeCreated.setExperience(10);
        monsterToBeCreated.setSpeed(1);
        monsterToBeCreated.setExperienceGrowthRate(1);
        monsterToBeCreated.setPhysicalAttackGrowthRate(1);
        monsterToBeCreated.setPhysicalDefenseGrowthRate(1);
        monsterToBeCreated.setSpecialAttackGrowthRate(1);
        monsterToBeCreated.setSpecialDefenseGrowthRate(1);
        monsterToBeCreated.setSpeedGrowthRate(1);
        } else if(monsterName==MonsterInfo.DrakSlime){
            monsterToBeCreated.setMonsterName("DrakSlime");
            monsterToBeCreated.setMaxHP(10);
            monsterToBeCreated.setCurrentHP(10);
            monsterToBeCreated.setMaxMP(7);
            monsterToBeCreated.setCurrentMP(7);
            monsterToBeCreated.setPhysicalAttack(6);
            monsterToBeCreated.setPhysicalDefense(4);
            monsterToBeCreated.setSpecialDefense(4);
            monsterToBeCreated.setSpecialAttack(6);
            monsterToBeCreated.setExperience(20);
            monsterToBeCreated.setSpeed(2);
            monsterToBeCreated.setExperienceGrowthRate(1);
            monsterToBeCreated.setPhysicalAttackGrowthRate(1);
            monsterToBeCreated.setPhysicalDefenseGrowthRate(1);
            monsterToBeCreated.setSpecialAttackGrowthRate(1);
            monsterToBeCreated.setSpecialDefenseGrowthRate(1);
            monsterToBeCreated.setSpeedGrowthRate(1);
        }
        return monsterToBeCreated;
    }
}
