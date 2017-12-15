package Model.BattleMediator;

import Model.Monster.Monster;
import Model.Skill.Skill;

public class MonsterTurn {
    Monster attackingMonster;
    Skill skill;
    Monster defendingMonster;

    public void setAttackingMonster(Monster attackingMonster) {
        this.attackingMonster = attackingMonster;
    }
    public void setDefendingMonster(Monster defendingMonster){
        this.defendingMonster=defendingMonster;
    }
    public void setSkill(Skill skill){
        this.skill=skill;
    }
    public int getSpeed(){
        return (int) attackingMonster.getAttribute("AGI").getAttributeValue();
    }
    public void execute(){

    }

}
