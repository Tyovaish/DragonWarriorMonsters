package Model.BattleMediator;

import Model.Monster.Monster;
import Model.Monster.MonsterObserver;
import Model.Player;
import Model.Skill.Skill;
import Model.Skill.SkillList;

import java.util.ArrayList;

public class BattleMediator {
    Player player;
    ArrayList<Monster> playerMonsters=new ArrayList<Monster>();
    ArrayList<Monster> enemyMonsters=new ArrayList<Monster>();
    ArrayList<MonsterTurn> playerMonsterTurns=new ArrayList<MonsterTurn>();
    ArrayList<MonsterTurn> enemyMonsterTurns=new ArrayList<MonsterTurn>();
    ArrayList<MonsterTurn> turnOrder=new ArrayList<>();
    int currentMonsterIndex=0;
    public BattleMediator(Player player,ArrayList < Monster > enemyMonsters) {
        this.player=player;
        this.playerMonsters=player.getMonsters();
        this.enemyMonsters=enemyMonsters;
    }

    public ArrayList<MonsterObserver> getEnemyMonsterObservers() {
        ArrayList<MonsterObserver> monsterObservers=new ArrayList<MonsterObserver>();
        for(int i=0; i<enemyMonsters.size();i++){
            monsterObservers.add(enemyMonsters.get(i).getMonsterObserver());
        }
        return monsterObservers;
    }
    public ArrayList<MonsterObserver> getPlayerMonsterObservers() {
        ArrayList<MonsterObserver> monsterObservers=new ArrayList<MonsterObserver>();
        for(int i=0; i<playerMonsters.size();i++){
            monsterObservers.add(playerMonsters.get(i).getMonsterObserver());
        }
        return monsterObservers;
    }

    public void autoFight(){
        for(int i=0;i<playerMonsters.size();i++){
            if(playerMonsters.get(i).getCurrentHPStat()!=0){
                //playerMonsterTurns.add(new MonsterTurn())
            }
        }
        executeBattle();
    }
    private void setMoveOrder(){
    }
    private void addEnemyMonsterMoves(){

    }
    public void executeBattle(){
          addEnemyMonsterMoves();
          setMoveOrder();
    }
    public MonsterObserver getCurrentMonsterSelected(){
        return playerMonsters.get(currentMonsterIndex).getMonsterObserver();
    }
    public void nextPlayerMonster(){
        ++currentMonsterIndex;
        while(currentMonsterIndex!=playerMonsters.size() && playerMonsters.get(currentMonsterIndex).getCurrentHPStat()==0) {
            ++currentMonsterIndex;
        }
        System.out.println(currentMonsterIndex);
    }
    public boolean lastMonsterToOrder(){
        if(currentMonsterIndex==playerMonsters.size()){
                return true;
        }
        int findIfMonsterIsAliveAfter=currentMonsterIndex;
        while(findIfMonsterIsAliveAfter!=playerMonsters.size()){
            if(playerMonsters.get(findIfMonsterIsAliveAfter).getCurrentHPStat()!=0){
                return false;
            }
            ++findIfMonsterIsAliveAfter;
        }
        return true;
    }
    public void resetMonsterToOrder(){
        currentMonsterIndex=0;
    }
    public void addPlayerMonsterTurn(MonsterObserver defendingMonsterObserver,Skill skill){
        Monster defendingMonster=null;
        for(int i=0;i<playerMonsters.size();i++){
            if(enemyMonsters.get(i).getMonsterObserver()==defendingMonsterObserver){
                defendingMonster=enemyMonsters.get(i);
            }
        }
        playerMonsterTurns.add(new MonsterTurn(playerMonsters.get(currentMonsterIndex),defendingMonster,skill));
    }
    public getCurrentMoveLabel(){

    }



}
