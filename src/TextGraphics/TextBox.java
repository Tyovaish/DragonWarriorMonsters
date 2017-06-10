import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Trevor on 5/10/2017.
 */
public class TextBox {
    int xPosition;
    int yPosition;
    int textSize;
    String text;
    ArrayList<BufferedImage> textGraphics;


    public TextBox(int xPosition, int yPosition, String text, int textSize) throws IOException {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.text = text;
        this.textSize = textSize;
        textGraphics = new ArrayList<BufferedImage>();
        try {
            this.setTextGraphics(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public TextBox(String text) throws IOException {
        this.text = text;
            textGraphics = new ArrayList<BufferedImage>();
            try {
                this.setTextGraphics(text);
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public void setTextGraphics(String text) throws IOException {
        for (int i = 0; i < text.length(); i++) {
            String path = "C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Buttons\\";
            if (text.charAt(i) == ':') {
                path += "colon.png";
            } else if (text.charAt(i) == '?') {
                path += "Qm.png";
            } else if (text.charAt(i) == '^') {
                path += "selector.png";
            }else if(text.charAt(i)==' '||text.charAt(i)=='%'){
                path+="space.png";
            }
            else {
                path += text.charAt(i) + ".png";
            }
            try {
                textGraphics.add(ImageIO.read(new File(path)));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public ArrayList<BufferedImage> getTextGraphics() {
        return textGraphics;
    }

    public void append(ArrayList<BufferedImage> textGraphics) {
        this.textGraphics.addAll(textGraphics);
    }

    public void display(Graphics g) {
        for (int i = 0; i < textGraphics.size(); i++) {
            g.drawImage(textGraphics.get(i), this.xPosition + i * textSize + 1, this.yPosition, textSize, textSize, null);
        }
    }

    public void display(Graphics g, int xPosition, int yPosition) {
        int currentXPosition=xPosition;
        int currentYPosition=yPosition;
        for (int i = 0; i < textGraphics.size(); i++) {
            if(text.charAt(i)=='%'){
                currentXPosition = xPosition;
                currentYPosition += textSize;
            }
            g.drawImage(textGraphics.get(i), currentXPosition + i * textSize + 1, currentYPosition, textSize, textSize, null);
        }
    }

    public int size() {
        return text.length() * textSize;
    }

    public String getText() {
        return text;
    }

    public static void selector(Graphics g,int xPosition,int yPosition,int textSize) throws IOException {
        String path = "C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Buttons\\selector.png";
        g.drawImage(ImageIO.read(new File(path)),xPosition,yPosition,textSize,textSize,null);
    }

}
