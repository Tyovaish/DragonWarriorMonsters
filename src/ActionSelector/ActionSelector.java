/**
 * Created by Trevor on 6/6/2017.
 */
public class ActionSelector {
    int rowPosition;
    int columnPosition;
    Layout layout;
    ActionSelector (Layout layout){
        this.layout=layout;
    }
    ActionSelector(){}
    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }


    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }
    public void up(){
        layout.moveSelectorUp();
    }
    public void down(){
        layout.moveSelectorDown();
    }
    public void left(){
        layout.moveSelectorLeft();
    }
    public void right(){
        layout.moveSelectorRight();
    }
    public void setLayout(Layout layout){
        this.layout=layout;
    }
}
