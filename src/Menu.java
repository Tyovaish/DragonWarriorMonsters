import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Trevor on 5/11/2017.
 */
public class Menu {
    Graphics g;
    int xPosition;
    int yPosition;
    int width;
    int length;
    int textSize;
    int spaceLength=8;
    boolean menuBorder;
    ArrayList<TextBox> textBoxes;
    Menu(Graphics g,int xPosition,int yPosition){
        this.g=g;
        this.xPosition=xPosition;
        this.yPosition=yPosition;
        textBoxes=new ArrayList<TextBox>();
    }

    public void addComponent(TextBox textBox){
        textBoxes.add(textBox);
    }
    public void display(){
        int currentXPosition=xPosition;
        int currentYPosition=yPosition;
        for(int i=0;i<textBoxes.size();i++) {
            textBoxes.get(i).setTextSize(textSize);
            if(textBoxes.get(i).getText().equals("%")){
                currentXPosition=xPosition;
                currentYPosition+=textSize+spaceLength;
            }
            else {
                textBoxes.get(i).print(g, currentXPosition, currentYPosition);
                currentXPosition += textBoxes.get(i).size() + spaceLength;
            }

        }
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void  setTextSize(int textSize){
        this.textSize=textSize;
    }
    public void setSpaceLength(int spaceLength){
        this.spaceLength=spaceLength;
    }
    public void addString(String stringToAdd) throws IOException {
        for(int i=0;i<stringToAdd.length();i++){
            String text="";
            while(i<stringToAdd.length()&&stringToAdd.charAt(i) != ' '&&stringToAdd.charAt(i)!='%'){
                text+=stringToAdd.charAt(i);
                i++;
            }
            textBoxes.add(new TextBox(text));
            if(i<stringToAdd.length()&&stringToAdd.charAt(i)=='%'){
                textBoxes.add(new TextBox("%"));
            }
        }

    }
    public void setXPosition(int xPosition){
        this.xPosition=xPosition;
    }
    public void setYPosition(int yPosition){
        this.yPosition=yPosition;
    }
}
