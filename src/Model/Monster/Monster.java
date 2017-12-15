package Model.Monster;

import Model.Attributes.Attribute;
import Model.Attributes.AttributeList;
import Model.Skill.Skill;
import Model.Skill.SkillList;

import java.util.ArrayList;

public class Monster {
    MonsterObserver monsterObserver;
    AttributeList attributes=new AttributeList();
    SkillList skills=new SkillList();
    public MonsterObserver getMonsterObserver(){
        return monsterObserver;
    }
    public void attachMonsterObserver(MonsterObserver monsterObserver){
        this.monsterObserver=monsterObserver;
    }
    public void addSkill(Skill skill){
        skills.addSkill(skill);
    }
    public void removeSkill(String skillName){
        skills.removeSkill(skillName);
    }
    public void addAttribute(Attribute attribute){
        attributes.addAttribute(attribute);
    }
    public void removeAttribute(String attributeName){
        attributes.removeAttribute(attributeName);
    }
    public SkillList getAllSkills(){
        return skills;
    }
    public AttributeList getAllAttributes() {
        return attributes;
    }

    public String getSpeciesName(){
        return (String) attributes.getAttributeValue("species");
    }

    public int getAgilityStat() {
        return (int) attributes.getAttributeValue("AGI") ;
    }
    public int getMaxHPStat(){
        return (int) attributes.getAttributeValue("HP");
    }
    public int getCurrentHPStat(){
        return (int) attributes.getAttributeValue("currentHP");
    }
    public void setMaxHPStat(int nextMaxHPValue){
        attributes.setAttributeValue("HP",nextMaxHPValue);
    }
}
