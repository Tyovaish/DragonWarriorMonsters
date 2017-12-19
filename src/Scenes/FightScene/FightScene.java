package Scenes.FightScene;
import Model.BattleMediator.BattleMediator;
import Model.Monster.MonsterObserver;
import Scenes.Scene;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.HashMap;

public class FightScene implements Scene {
    public final static int SCENE_WIDTH=1000;
    public final static int SCENE_LENGTH=1000;
    final static Font gameboyFont=Font.loadFont("file:C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Font\\GameBoy.ttf", 30);
    Group fightScene=null;
    BattleMediator battleMediator=null;
    ArrayList<MonsterObserver> enemyMonstersSpritesToDisplay=null;
    ArrayList<MonsterObserver> playerMonstersStatsToDisplay=null;
    FightSceneController fightSceneController=null;
    public FightScene(BattleMediator battleMediator){
        this.fightScene=new Group();
        this.battleMediator=battleMediator;
        this.enemyMonstersSpritesToDisplay=battleMediator.getEnemyMonsterObservers();
        this.playerMonstersStatsToDisplay=battleMediator.getPlayerMonsterObservers();
        this.fightSceneController=new FightSceneController(this,battleMediator);
        addEnemyMonsterSprites();
        addPlayerMonsterStats();
    }
    public Group getScene(){
        return fightScene;

    }
    private void addEnemyMonsterSprites(){
        for(int i=0;i<enemyMonstersSpritesToDisplay.size();i++){
           ImageView enemyMonserView=enemyMonstersSpritesToDisplay.get(i).getImageView();
           System.out.println(enemyMonserView);
           enemyMonserView.setX(i*SCENE_WIDTH/3);
           enemyMonserView.setY(SCENE_LENGTH/3);
           enemyMonserView.setFitWidth(SCENE_WIDTH/3);
           enemyMonserView.setFitHeight(SCENE_LENGTH/3);
           fightScene.getChildren().add(enemyMonserView);
        }
    }
    private void addPlayerMonsterStats(){
        for(int i=0;i<playerMonstersStatsToDisplay.size();i++){
            Group monsterStatDisplay=new Group();
            monsterStatDisplay.setLayoutX(i*SCENE_WIDTH/3);
            MonsterObserver currentMonsterObserver= playerMonstersStatsToDisplay.get(i);
            Label currentHPLabel=currentMonsterObserver.getCurrentHPStat();
            Label currentMPLabel=currentMonsterObserver.getCurrentMPStat();
            Label monsterNameLabel=currentMonsterObserver.getMonsterName();
            Label currentHPIdentifier=new Label();
            Label currentMPIdentifier=new Label();
            currentHPIdentifier.setFont(gameboyFont);
            currentMPIdentifier.setFont(gameboyFont);
            currentHPLabel.setFont(gameboyFont);
            currentMPLabel.setFont(gameboyFont);
            monsterNameLabel.setFont(gameboyFont);
            currentHPIdentifier.setText("HP: ");
            currentMPIdentifier.setText("MP: ");
            currentHPIdentifier.setLayoutY(SCENE_LENGTH/16);
            currentMPIdentifier.setLayoutY(2*SCENE_LENGTH/16);
            currentMonsterObserver.getCurrentHPStat().setLayoutY(SCENE_LENGTH/16);
            currentMonsterObserver.getCurrentMPStat().setLayoutY(2*SCENE_LENGTH/16);
            currentHPLabel.setLayoutX(150);
            currentMPLabel.setLayoutX(150);
            monsterStatDisplay.getChildren().addAll(currentHPLabel,currentMPLabel,monsterNameLabel,currentHPIdentifier,currentMPIdentifier);
            fightScene.getChildren().add(monsterStatDisplay);
        }
    }


}
