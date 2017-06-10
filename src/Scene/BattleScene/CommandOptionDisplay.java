import java.awt.*;
import java.io.IOException;

/**
 * Created by Trevor on 6/9/2017.
 */
public class CommandOptionDisplay {
    Layout battleTextDisplay;

    CommandOptionDisplay(ActionSelector actionSelector) throws IOException {
        battleTextDisplay=new Layout();
        actionSelector.setLayout(battleTextDisplay);
        battleTextDisplay.setRows(1);
        battleTextDisplay.addSelector(actionSelector);
        battleTextDisplay.addString("FIGHT");
        battleTextDisplay.addString("COMMAND");
        battleTextDisplay.addString("ITEM");
        battleTextDisplay.addString("RUN");
        battleTextDisplay.setTextSize(25);
    }
    public void display(Graphics g, int xPosition, int yPosition, int width, int height) throws IOException {
        battleTextDisplay.setXPosition(xPosition);
        battleTextDisplay.setYPosition(yPosition+50);
        battleTextDisplay.setWidth(width);
        battleTextDisplay.setHeight(height);
       battleTextDisplay.display(g);
    }
}
