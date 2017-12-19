package Test.SceneTest.FightSceneTest;

import Model.BattleMediator.BattleMediator;
import Model.Monster.Monster;
import Model.Monster.MonsterFactory.MonsterBuilder;
import Model.Player;
import Scenes.FightScene.FightScene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;

public class FightSceneTest extends Application{
    final static Font gameboyFont=Font.loadFont("file:C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Font\\GameBoy.ttf", 50);
    public final static int SCENE_WIDTH=1000;
    public final static int SCENE_LENGTH=1000;
    @Override
    public void start(Stage primaryStage) {
        MonsterBuilder monsterBuilder=new MonsterBuilder();
        Player player=new Player();
        monsterBuilder.setName("Monster");
        player.addMonster(monsterBuilder.createMonster("andreal"));
        player.addMonster(monsterBuilder.createMonster("zoma"));
        player.addMonster(monsterBuilder.createMonster("goldslime"));
        ArrayList<Monster> enemyMonsters=new ArrayList<>();
        enemyMonsters.add(monsterBuilder.createMonster("andreal"));
        enemyMonsters.add(monsterBuilder.createMonster("zoma"));
        enemyMonsters.add(monsterBuilder.createMonster("goldslime"));
        BattleMediator battleMediator=new BattleMediator(player,enemyMonsters);

        FightScene fightScene=new FightScene(battleMediator);
        Scene scene=new Scene(fightScene.getScene(),SCENE_WIDTH, SCENE_LENGTH);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
