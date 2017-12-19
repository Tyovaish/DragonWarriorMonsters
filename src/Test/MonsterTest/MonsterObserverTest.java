package Test.MonsterTest;

import Model.Monster.Monster;
import Model.Monster.MonsterFactory.MonsterBuilder;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class MonsterObserverTest extends Application {
    public final static int SCENE_WIDTH=1000;
    public final static int SCENE_LENGTH=1000;
    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root=new Group();
        MonsterBuilder monsterBuilder=new MonsterBuilder();
        Monster slime =monsterBuilder.createMonster("zoma");
      ImageView imageView=slime.getMonsterObserver().getImageView();
        imageView.setX(0);
        imageView.setY(SCENE_WIDTH/3);
        imageView.setFitHeight(SCENE_LENGTH/3);
        imageView.setFitWidth(SCENE_WIDTH/3);
        root.getChildren().add(imageView);
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_LENGTH);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
