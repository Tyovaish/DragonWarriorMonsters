package Model.BattleMediator;

import Model.Monster.Monster;
import Model.Skill.Skill;

public class MonsterTurn {
    Monster attackingMonster;
    Skill skill;
    Monster defendingMonster;
    MonsterTurn(Monster attackingMonster,Monster defendingMonster,Skill skill){
        this.attackingMonster=attackingMonster;
        this.defendingMonster=defendingMonster;
        this.skill=skill;
    }
    public void setAttackingMonster(Monster attackingMonster) {
        this.attackingMonster = attackingMonster;
    }
    public void setDefendingMonster(Monster defendingMonster){
        this.defendingMonster=defendingMonster;
    }
    public void setSkill(Skill skill){
        this.skill=skill;
    }
    public void execute(){
            defendingMonster.setCurrentHPStat(defendingMonster.getCurrentHPStat()-1);
            System.out.println(defendingMonster.getCurrentHPStat());
            defendingMonster.getMonsterObserver().updateAttributes();
            attackingMonster.getMonsterObserver().updateAttributes();
    }

}
