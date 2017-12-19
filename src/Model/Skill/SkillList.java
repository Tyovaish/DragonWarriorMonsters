package Model.Skill;

import java.util.ArrayList;

public class SkillList {
    ArrayList<Skill> skills=new ArrayList<Skill>();
    public Skill getSkill(String skillName){
        for(int i=0;i<skills.size();++i){
            if(skills.get(i).getSkillName().compareTo(skillName)==0){
                return skills.get(i);
            }
        }
        return null;
    }

    public void addSkill(Skill skill){
        skills.add(skill);
    }
    public void removeSkill(String skillName){
        for(int i=0;i<skills.size();++i){
            if(skills.get(i).getSkillName().compareTo(skillName)==0){
                skills.remove(i);
            }
        }
    }
    public Skill get(int skillPosition){
        return skills.get(skillPosition);
    }
    public int size(){
        return skills.size();
    }
}
