import java.awt.*;
import java.io.IOException;

/**
 * Created by Trevor on 5/29/2017.
 */
public class PlayerMonsterStatDisplay {
    MonsterObserver monsterObserver;
    Layout monsterStatDisplay;
    public void display(Graphics g, int xPosition, int yPosition, int width, int height) throws IOException {
        monsterStatDisplay=new Layout();
        monsterStatDisplay.addString("AK");
        monsterStatDisplay.addString("HP: ");
        monsterStatDisplay.addString("MP: ");
        monsterStatDisplay.setRows(3);
        monsterStatDisplay.setTextSize(25);
        monsterStatDisplay.setXPosition(xPosition);
        monsterStatDisplay.setYPosition(yPosition);
        monsterStatDisplay.setWidth(width);
        monsterStatDisplay.setHeight(height);
        monsterStatDisplay.display(g);

    }
}
