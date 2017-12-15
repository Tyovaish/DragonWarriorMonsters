package Scenes;
import Model.BattleMediator.BattleMediator;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class FightScene{
    Scene fightScene;
    BattleMediator battleMediator;
    public FightScene(StackPane root){
        fightScene=new Scene(root);

    }
    public Scene getScene(){return fightScene;}
}
