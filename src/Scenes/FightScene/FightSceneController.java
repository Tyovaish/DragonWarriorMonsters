package Scenes.FightScene;

import Model.BattleMediator.BattleMediator;
import javafx.scene.Group;
import javafx.scene.control.Label;

import static Scenes.FightScene.FightScene.SCENE_LENGTH;
import static Scenes.FightScene.FightScene.gameboyFont;

public class FightSceneController {
    Group fightScene=null;
    BattleMediator battleMediator=null;
    FightSceneController(Group fightScene,BattleMediator battleMediator){
        this.fightScene=fightScene;
        this.battleMediator=battleMediator;
        addFightCommand();
    }
    public void addFightCommand(){
        Group fightMenu=new Group();
        fightMenu.setLayoutY(2*SCENE_LENGTH/3);
        Label fight=new Label();
        fight.setText("FIGHT");
        fight.setFont(gameboyFont);
        Label command=new Label();
        command.setLayoutY(SCENE_LENGTH/12);
        command.setText("COMMAND");
        command.setFont(gameboyFont);
        Label items=new Label();
        items.setLayoutY(2*SCENE_LENGTH/12);
        items.setText("ITEMS");
        items.setFont(gameboyFont);
        Label run=new Label();
        run.setLayoutY(3*SCENE_LENGTH/12);
        run.setText("RUN");
        run.setFont(gameboyFont);
        fightMenu.getChildren().addAll(fight,command,items,run);
        fightScene.getChildren().addAll(fightMenu);
    }

}
