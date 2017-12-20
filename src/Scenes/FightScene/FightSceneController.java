package Scenes.FightScene;

import Model.BattleMediator.BattleMediator;
import Model.Monster.Monster;
import Model.Monster.MonsterObserver;
import Model.Monster.MonsterSkillLabel;
import Model.Skill.Skill;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

import static Scenes.FightScene.FightScene.SCENE_LENGTH;
import static Scenes.FightScene.FightScene.gameboyFont;

public class FightSceneController {
    Group fightScene=null;
    BattleMediator battleMediator=null;
    FightSceneController(FightScene fightScene,BattleMediator battleMediator){
        this.fightScene=fightScene.getScene();
        this.battleMediator=battleMediator;
        addFightMenu();
    }
    public void addFightMenu(){
        Group fightMenu=new Group();
        fightMenu.setLayoutY(2*SCENE_LENGTH/3);
        Label fight=new Label();
        fight.setText("FIGHT");
        fight.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                battleMediator.autoFight();
                System.out.println("Hit");
            }
        });
        fight.setFont(gameboyFont);
        Label command=new Label();
        command.setLayoutY(SCENE_LENGTH/12);
        command.setText("COMMAND");
        command.setFont(gameboyFont);
        command.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                fightScene.getChildren().remove(fightMenu);
                addCommandMenu();
            }
        });
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
    public void addCommandMenu(){
        ArrayList<MonsterSkillLabel> monsterSkillLabels=battleMediator.getCurrentMonsterSelected().getAllSkillLabels();
        Group commandMenu=new Group();
        commandMenu.setLayoutY(2*SCENE_LENGTH/3);
        Label monsterSelected=new Label();
        monsterSelected.setText(battleMediator.getCurrentMonsterSelected().getMonsterName().getText());
        monsterSelected.setFont(gameboyFont);
        commandMenu.getChildren().add(monsterSelected);
        for(int i=0;i<monsterSkillLabels.size();++i){
            MonsterSkillLabel monsterSkill=monsterSkillLabels.get(i);
            Label monsterSkillLabel=monsterSkill.getSkillLabel();
            monsterSkillLabel.setFont(gameboyFont);
            monsterSkillLabel.setLayoutY((i+1)*SCENE_LENGTH/12);
            monsterSkillLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    fightScene.getChildren().remove(commandMenu);
                    addEnemyMonsterSelection(monsterSkill.getSkill());
                }
            });
            commandMenu.getChildren().add(monsterSkillLabel);
        }
        fightScene.getChildren().addAll(commandMenu);
    }
    public void addEnemyMonsterSelection(Skill monsterSkill){
        ArrayList<MonsterObserver> enemyMonsters=battleMediator.getEnemyMonsterObservers();
        Group enemyMonsterNameGroup=new Group();
        enemyMonsterNameGroup.setLayoutY(2*SCENE_LENGTH/3);
        for(int i=0;i<enemyMonsters.size();i++){
            MonsterObserver enemyMonster=enemyMonsters.get(i);
            Label enemyMonsterName=enemyMonster.getMonsterName();
            enemyMonsterName.setFont(gameboyFont);
            enemyMonsterName.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    fightScene.getChildren().remove(enemyMonsterNameGroup);
                    battleMediator.addPlayerMonsterTurn(enemyMonster,monsterSkill);
                    battleMediator.nextPlayerMonster();
                    if(battleMediator.lastMonsterToOrder()){
                        addDisplayMonsterTurns;
                        battleMediator.resetMonsterToOrder();
                    } else {
                        addCommandMenu();
                    }
                }
            });
            enemyMonsterName.setLayoutY(i*SCENE_LENGTH/9);
            enemyMonsterNameGroup.getChildren().add(enemyMonsterName);
        }
        fightScene.getChildren().add(enemyMonsterNameGroup);

    }

}
