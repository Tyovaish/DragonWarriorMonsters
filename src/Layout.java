import java.util.ArrayList;

/**
 * Created by Trevor on 5/11/2017.
 */
public class Layout {
    ArrayList<Menu> menuList;
    int xPosition;
    int yPosition;
    int width;
    int height;
    int rows;
    int columns;
    int textSize;
    boolean hasSelector;
    Layout(){
        rows=1;
        columns=1;
        xPosition=0;
        yPosition=0;
        menuList=new ArrayList<Menu>();
        hasSelector=false;
    }
    public void addSelector(){hasSelector=true;}
    public void setRows(int rows){
        this.rows=rows;
    }
    public void setXPosition(int xPosition){
        this.xPosition=xPosition;
    }
    public void setYPosition(int yPosition){
        this.yPosition=yPosition;
    }
    public void setColumns(int columns){
        this.columns=columns;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setTextSize(int textSize){
        this.textSize=textSize;
    }
    public void addComponent(Menu menu){
        menuList.add(menu);
    }
    public void display(){
        for (int i=0;i<menuList.size();i++){
            Menu currentMenu=menuList.get(i);
            currentMenu.setXPosition(xPosition+i*width/columns+(hasSelector?50:0));
            currentMenu.setYPosition(yPosition);
            currentMenu.setTextSize(textSize);
            currentMenu.display();
        }
    }
}
