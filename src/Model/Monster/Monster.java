package Model.Monster;

import Model.Attributes.Attribute;
import Model.Skill.Skill;

import java.util.ArrayList;

public class Monster {
    MonsterObserver monsterObserver;
    ArrayList<Attribute> attributes=new ArrayList<Attribute>();
    ArrayList<Skill> skills=new ArrayList<Skill>();

    public Attribute getAttribute(String attributeName) {
            for(int i=0;i<attributes.size();++i){
                if(attributes.get(i).getAttributeName()==attributeName){
                    return attributes.get(i);
                }
            }
            return null;
    }
    public void addAttribute(Attribute attribute){
       attributes.add(attribute);
    }
    public void removeAttribute(String attributeName){
        for(int i=0;i<attributes.size();++i){
            if(attributes.get(i).getAttributeName()==attributeName){
                attributes.remove(i);
            }
        }
    }

    public ArrayList<Attribute> getAllAttributes() {
        return attributes;
    }
    public void addSkill(Skill skill){
        skills.add(skill);
    }
    public void removeSkill(String skillName){
        for(int i=0;i<skills.size();++i){
            if(skills.get(i).getSkillName() == skillName){
                skills.remove(i);
            }
        }
    }
    public MonsterObserver getMonsterObserver(){
        return monsterObserver;
    }
    public ArrayList<Skill> getAllSkills(){
        return skills;
    }

}
