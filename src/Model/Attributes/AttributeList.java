package Model.Attributes;

import java.util.ArrayList;

public class AttributeList<T> {
    ArrayList<Attribute> attributes=new ArrayList<Attribute>();
    public Attribute getAttribute(String attributeName) {
        for(int i=0;i<attributes.size();++i){
            if(attributes.get(i).getAttributeName()==attributeName){
                return attributes.get(i);
            }
        }
        return null;
    }
    public T getAttributeValue(String attributeName) {
        for(int i=0;i<attributes.size();++i){
            if(attributes.get(i).getAttributeName()==attributeName){
                return (T) attributes.get(i).getAttributeValue();
            }
        }
        return null;
    }
    public void setAttributeValue(String attributeName,T nextValue){
        getAttribute(attributeName).setAttributeValue(nextValue);
    }
    public void addAttribute(Attribute attribute){
        attributes.add(attribute);
    }
    public void removeAttribute(String attributeName){
        for(int i=0;i<attributes.size();++i){
            if(attributes.get(i).getAttributeName()==attributeName){
                attributes.remove(i);
            }
        }
    }
    public Attribute get(int attributePosition){
        return attributes.get(attributePosition);
    }
}
