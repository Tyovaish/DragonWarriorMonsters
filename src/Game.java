
/**
 * Created by Trevor Yovaish on 3/4/2017.
 */

import Model.Attributes.Attribute;
import Model.Monster.Monster;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;


public class Game extends Application{
    final static Font gameboyFont=Font.loadFont("file:C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Font\\GameBoy.ttf", 50);
    public static int SCENE_WIDTH=1000;
    public static int SCENE_LENGTH=1000;
    @Override
    public void start(Stage primaryStage) {
        Label btn = new Label();
        btn.setFont(gameboyFont);
        Monster monster=new Monster();
        monster.addAttribute(new Attribute("maxHP",12));
        btn.setText(String.valueOf(monster.getMaxHPStat()));
        btn.setLayoutX(0);
        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Fight");
                monster.setMaxHPStat(monster.getMaxHPStat()-1);
                System.out.println(monster.getMaxHPStat());
                btn.setText(String.valueOf(monster.getMaxHPStat()));
                System.out.println(0);
            }
        });
        btn.setLayoutY(2*SCENE_LENGTH/3);
        btn.setPrefSize(SCENE_WIDTH/4,SCENE_WIDTH/8);
        btn.setFont(gameboyFont);
        Label text=new Label();
        text.setFont(gameboyFont);
        text.setText("HP");
        Group root = new Group();
        // load the image
        File file = new File("C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Model\\Monster\\MonsterAssets\\battleSprites\\akubar.png");
        Image image = new Image(file.toURI().toString());
        ImageView imageView=new ImageView();
        imageView.setImage(image);
        imageView.setX(0);
        imageView.setY(SCENE_WIDTH/3-100);
        imageView.setFitHeight(SCENE_WIDTH/3);
        imageView.setFitWidth(SCENE_WIDTH/3);
        File file2 = new File("C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Model\\Monster\\MonsterAssets\\battleSprites\\andreal.png");
        Image image2 = new Image(file2.toURI().toString());
        ImageView imageView2=new ImageView();
        imageView2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Attacking akubar");
            }


        });
        imageView2.setImage(image2);
        imageView2.setX(SCENE_LENGTH/3);
        imageView2.setY(SCENE_WIDTH/3-100);
        imageView2.setFitHeight(SCENE_WIDTH/3);
        imageView2.setFitWidth(SCENE_WIDTH/3);
        // simple displays ImageView the image as is
        root.getChildren().addAll(btn,imageView,imageView2,text);
        imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Attacking akubar");
                if(root.getChildren().contains(imageView)) {
                    root.getChildren().remove(imageView);
                } else {
                    root.getChildren().add(imageView);
                }
            }
        });
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_LENGTH);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
