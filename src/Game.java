
/**
 * Created by Trevor Yovaish on 3/4/2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;


public class Game extends Application{
    final static Font gameboyFont=Font.loadFont("file:C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Font\\GameBoy.ttf", 50);
    public final int SCENE_WIDTH=1000;
    public final int SCENE_LENGTH=1000;
    @Override
    public void init() throws Exception{

    }
    @Override
    public void start(Stage primaryStage) {
        Label btn = new Label();
        btn.setFont(gameboyFont);
        btn.setText("FIGHT");
        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Fight");
            }
        });
        btn.setLayoutX(0);
        btn.setLayoutY(2*SCENE_LENGTH/3);
        btn.setPrefSize(SCENE_WIDTH/4,SCENE_WIDTH/8);
        btn.setFont(gameboyFont);
        Label text=new Label();
        text.setFont(gameboyFont);
        text.setText("HP");
        Group root = new Group();
        StackPane holder = new StackPane();
        holder.setPrefSize(300,300);
        // load the image
        File file = new File("C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Model\\Monster\\MonsterAssets\\battleSprites\\akubar.png");
        Image image = new Image(file.toURI().toString());
        ImageView imageView=new ImageView();
        imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Attacking akubar");
            }
        });
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
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_LENGTH);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
