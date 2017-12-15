package Model.Monster;

import Model.Attributes.Attribute;
import Model.Attributes.AttributeList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.util.ArrayList;

public class MonsterObserver{
    final String monsterAssetLocation="C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Model\\Monster\\MonsterAssets\\battleSprites\\";
    ImageView monsterView=null;
    AttributeList attributes=new AttributeList();
    public MonsterObserver(Monster monster){
        String spriteLocation=monsterAssetLocation+monster.getSpeciesName();
        File file=new File(spriteLocation);
        Image monsterSpriteImage = new Image(file.toURI().toString());
        this.monsterView=new ImageView();
        this.monsterView.setImage(monsterSpriteImage);
        this.attributes=monster.getAllAttributes();
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
    public int getMaxMPStat(){
        return (int) attributes.getAttributeValue("MP");
    }
    public int getCurrentMPStat(){
        return (int) attributes.getAttributeValue("currentMP");
    }


}
