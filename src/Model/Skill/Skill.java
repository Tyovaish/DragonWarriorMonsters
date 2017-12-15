package Model.Skill;

import Model.Attributes.Attribute;

import java.util.ArrayList;

public class Skill {
    String skillName;
    String skillType;
    ArrayList<Attribute> attributes=new ArrayList<Attribute>();
    public String getSkillName(){
        return skillName;
    }
    public void setSkillType(String skillType){
        this.skillType=skillType;
    }
    public void addAttribute(Attribute attribute){
        attributes.add(attribute);
    }
    public Attribute getAttribute(String attributeName){
        for(int i=0;i<attributes.size();i++){
            if(attributes.get(i).getAttributeName()==attributeName){
                return attributes.get(i);
            }
        }
        return null;
    }
}
