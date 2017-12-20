package Model.Monster;


import Model.Attributes.Attribute;
import javafx.scene.control.Label;

import javax.swing.text.html.ImageView;

public class MonsterAttributeLabel {
        Attribute attribute=null;
        Label statImageView=null;
        public MonsterAttributeLabel(Attribute attribute){
            this.attribute=attribute;
            this.statImageView=new Label();
            this.statImageView.setText(String.valueOf(attribute.getAttributeValue()).toUpperCase());
        }
        public String getAttributeName(){
            return attribute.getAttributeName();
        }
        public Label getLabel(){
            return statImageView;
        }
        public void update(){
            this.statImageView.setText(String.valueOf(attribute.getAttributeValue()));
        }


}
