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
    ArrayList<MonsterTurn> monsterTurns=new ArrayList<MonsterTurn>();
    int currentMonsterIndex=0;

    public BattleMediator(Player player,ArrayList < Monster > enemyMonsters) {
        this.player=player;
        this.playerMonsters=player.getMonsters();
        this.enemyMonsters=enemyMonsters;
    }

    private void setMoveOrder(){

    }
    private void addEnemyMonsterMoves(){

    }
    public ArrayList<MonsterTurn> getCurrentMonsterSkills(){
       SkillList skills=playerMonsters.get(currentMonsterIndex).getAllSkills();
        ArrayList<MonsterTurn> monsterTurns=new ArrayList<MonsterTurn>();
        for(int i=0;i<skills.size();i++){
            MonsterTurn monsterTurn=new MonsterTurn();
            Skill skillToAdd=skills.get(i);
            monsterTurn.setSkill(skillToAdd);
            monsterTurns.add(monsterTurn);
        }
        return monsterTurns;
    }


    public ArrayList<Monster> getEnemyMonsters() {
        return enemyMonsters;
    }

    public void removePreviousMonsterTurn(){
        monsterTurns.remove(monsterTurns.size()-1);
        --currentMonsterIndex;
    }
    public void executeBattle(){
        addEnemyMonsterMoves();
        setMoveOrder();
    }



}
