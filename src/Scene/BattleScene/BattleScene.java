import javafx.collections.ArrayChangeListener;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Trevor on 5/29/2017.
 */
public class BattleScene extends Scene {
    int width;
    int height;
    ArrayList<EnemyMonsterSpriteDisplay> enemyMonsterSpriteDisplays;
    ArrayList<PlayerMonsterStatDisplay> playerMonsterStatDisplays;
    ArrayList<MonsterObserver> monsterObservers;
    ArrayList<MonsterVisitor> monsterVisitors;
    Layout battleTextDisplay;
    CommandOptionDisplay commandOptionDisplay;

    BattleScene(int width,int height) throws IOException {
        enemyMonsterSpriteDisplays=new ArrayList<EnemyMonsterSpriteDisplay>();
        playerMonsterStatDisplays=new ArrayList<PlayerMonsterStatDisplay>();
        monsterObservers=new ArrayList<MonsterObserver>();
        monsterVisitors=new ArrayList<MonsterVisitor>();
        this.width=width;
        this.height=height;
        battleTextDisplay=new Layout();
        actionSelector=new ActionSelector();
        commandOptionDisplay=new CommandOptionDisplay(actionSelector);
        playerMonsterStatDisplays.add(new PlayerMonsterStatDisplay());
        playerMonsterStatDisplays.add(new PlayerMonsterStatDisplay());
    }
    public void changeMonster(String monsterName) throws IOException {
        enemyMonsterSpriteDisplays.remove(2);
        enemyMonsterSpriteDisplays.add(new EnemyMonsterSpriteDisplay(monsterName));
    }
    public void setWidth(int width) {
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void addTestMonsters() throws IOException {
        enemyMonsterSpriteDisplays.add(new EnemyMonsterSpriteDisplay("andreal"));
        enemyMonsterSpriteDisplays.add(new EnemyMonsterSpriteDisplay("gateguard"));
        enemyMonsterSpriteDisplays.add(new EnemyMonsterSpriteDisplay("slime"));

    }
    public void display(Graphics g) throws IOException {
        for(int i=0;i<enemyMonsterSpriteDisplays.size();i++){
            enemyMonsterSpriteDisplays.get(i).display(g,i*width/3,height/3,width/3,height/3);
        }
        for (int i=0;i<playerMonsterStatDisplays.size();i++){
            playerMonsterStatDisplays.get(i).display(g,i*width/3,0,width/3,height/3);
        }
      commandOptionDisplay.display(g,0,2*height/3,width/3,height/3);
    }







}
