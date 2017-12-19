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
        }

    }
    private ArrayList<MonsterTurn> setMoveOrder(){
            return null;
    }

    private void addEnemyMonsterMoves(){

    }



}
