import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Trevor on 5/29/2017.
 */
public class EnemyMonsterSpriteDisplay {
    BufferedImage monsterSprite;
    EnemyMonsterSpriteDisplay(String monsterName) throws IOException {
         monsterSprite= ImageIO.read(new File("C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\battleSprites\\"+monsterName+".png"));
    }
    public void display(Graphics g, int xPosition, int yPosition,int width, int height){
        g.drawImage(monsterSprite, xPosition, yPosition, width, height, null);
    }

}
