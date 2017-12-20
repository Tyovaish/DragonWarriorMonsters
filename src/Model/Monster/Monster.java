package Model.Monster;

import Model.Attributes.Attribute;
import Model.Attributes.AttributeList;
import Model.Skill.Skill;
import Model.Skill.SkillList;

import java.util.ArrayList;
import java.util.Random;

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
    public Skill getSkill(String skillName){return skills.getSkill(skillName);}
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
        return (int) attributes.getAttributeValue("maxHP");
    }
    public int getCurrentHPStat(){
        return (int) attributes.getAttributeValue("currentHP");
    }
    public void setMaxHPStat(int nextMaxHPValue){
        attributes.setAttributeValue("maxHP",nextMaxHPValue);
    }
    public int getMaxMPStat(){
       return (int) attributes.getAttributeValue("maxMP");
    }
    public void setMaxMPStat(int nextMaxMPValue){ attributes.setAttributeValue("maxMP",nextMaxMPValue); }
    public String getMonsterName(){return (String) attributes.getAttributeValue("monsterName");}
    public void setMonsterName(String nextMonsterName){attributes.setAttributeValue("monsterName",nextMonsterName);}
    public int getMaxAGIStat() {
        return (int) attributes.getAttributeValue("AGI");
    }
    public void setCurrentHPStat(int nextHPValue) {
       attributes.setAttributeValue("currentHP",nextHPValue);
    }
    public Skill getRandomSkill(){
        int randomSkill=new Random().nextInt(skills.size());
        return skills.get(randomSkill);
    }
}
