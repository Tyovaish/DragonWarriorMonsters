package Model;

import Model.Attributes.Attribute;
import Model.Items.Item;
import Model.Monster.Monster;

import java.util.ArrayList;

public class Player {
    ArrayList<Attribute> attributes=new ArrayList<Attribute>();
    ArrayList<Item> items=new ArrayList<Item>();
    ArrayList<Monster> monsters=new ArrayList<Monster>();
    public ArrayList<Monster> getMonsters(){
        return monsters;
    }
    public void addMonster(Monster monster){
        monsters.add(monster);
    }
}
