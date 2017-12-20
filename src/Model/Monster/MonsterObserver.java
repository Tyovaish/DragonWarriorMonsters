package Model.Monster;

import Model.Attributes.AttributeList;
import Model.Skill.SkillList;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;
import java.util.ArrayList;

public class MonsterObserver{
    final String monsterAssetLocation="C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Model\\Monster\\MonsterAssets\\battleSprites\\";
    ImageView monsterView=null;
    ArrayList<MonsterAttributeLabel> monsterAttributeLabels=new ArrayList<MonsterAttributeLabel>();
    ArrayList<MonsterSkillLabel> monsterSkillLabels=new ArrayList<>();

    public MonsterObserver(Monster monster){
        String spriteLocation=monsterAssetLocation+monster.getSpeciesName()+".png";
        System.out.println(spriteLocation);
        File file=new File(spriteLocation);
        Image monsterSpriteImage = new Image(file.toURI().toString());
        this.monsterView=new ImageView();
        this.monsterView.setImage(monsterSpriteImage);
        createAttributeLabels(monster.getAllAttributes());
        createSkillLabels(monster.getAllSkills());

    }
    public ImageView getImageView(){
        return monsterView;
    }
    public Label getMonsterName(){return getAttributeLabel("monsterName");}
    public Label getCurrentHPStat(){return getAttributeLabel("currentHP");}
    public Label getCurrentMPStat(){ return getAttributeLabel("currentMP");}
    public void updateAttributes(){
            for(int i=0;i<monsterAttributeLabels.size();i++){
                monsterAttributeLabels.get(i).update();
            }
    }
    private void createAttributeLabels(AttributeList attributeList){
        for(int i=0;i<attributeList.size();i++){
                monsterAttributeLabels.add(new MonsterAttributeLabel(attributeList.get(i)));
        }
    }
    private void createSkillLabels(SkillList skillList) {
        for(int i=0;i<skillList.size();i++){
            monsterSkillLabels.add(new MonsterSkillLabel(skillList.get(i)));
        }
    }
    private Label getAttributeLabel(String attributeName){
        for(int i=0;i<monsterAttributeLabels.size();i++){
            if(monsterAttributeLabels.get(i).getAttributeName().compareTo(attributeName)==0){
                return monsterAttributeLabels.get(i).getLabel();
            }
        }
        return null;
    }
    public ArrayList<MonsterSkillLabel> getAllSkillLabels(){
        return monsterSkillLabels;
    }


}
