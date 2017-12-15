package Model.Attributes;
public class Attribute<T>{
    String attributeName;
    T attributeValue;
    public Attribute(String name, T value){
        this.attributeName=name;
        this.attributeValue=value;
    }

    public T getAttributeValue(){
        return attributeValue;
    }
    public String getAttributeName(){
        return attributeName;
    }

    public void setAttributeValue(T value) {
        this.attributeValue = value;
    }
    public void setAttributeName(String name){
        this.attributeName=name;
    }
}
