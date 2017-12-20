package Model.Monster.MonsterFactory;

import Model.Attributes.Attribute;
import Model.Monster.Monster;
import Model.Monster.MonsterAssets.FileParsers.MonsterStatFileParser;
import Model.Monster.MonsterObserver;
import Model.Skill.Skill;

public class MonsterBuilder {
    Monster createdMonster=new Monster();
    String monsterName=null;
    int level=1;
    public Monster createMonster(String monsterSpeciesName){
        createdMonster= MonsterStatFileParser.getMonster(monsterSpeciesName.toLowerCase());
        createdMonster.addAttribute(new Attribute("monsterName",monsterSpeciesName));
        createdMonster.addSkill(new Skill("Physical Attack","physical"));
        createdMonster.attachMonsterObserver(new MonsterObserver(createdMonster));
        return createdMonster;
    }
    public void setLevel(int level){
        this.level=level;
    }
    public void setName(String monsterName){this.monsterName=monsterName;}
}
