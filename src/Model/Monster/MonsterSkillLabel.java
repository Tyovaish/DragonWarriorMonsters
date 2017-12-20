package Model.Monster;

import Model.Skill.Skill;
import javafx.scene.control.Label;


public class MonsterSkillLabel {
    Skill skill=null;
    Label skillLabel=new Label();
    public MonsterSkillLabel(Skill skill){
        this.skill=skill;
        skillLabel.setText(skill.getSkillName().toUpperCase());
    }
    public Skill getSkill(){
        return skill;
    }
    public Label getSkillLabel(){
        return skillLabel;
    }
}
