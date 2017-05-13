import javax.swing.*;
import java.awt.*;

/**
 * Created by Trevor on 5/9/2017.
 */
public class Window {
    public Window(int w,int h, String title,Game game){
        game.setPreferredSize(new Dimension(w,h));
        JFrame frame=new JFrame(title);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        game.start();
    }
}
