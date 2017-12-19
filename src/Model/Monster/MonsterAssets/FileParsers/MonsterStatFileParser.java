package Model.Monster.MonsterAssets.FileParsers;

import Model.Attributes.Attribute;
import Model.Monster.Monster;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MonsterStatFileParser {
    public static Monster getMonster(String monsterName){
      Monster monster=new Monster();
        try {
            File file = new File("C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\Model\\Monster\\MonsterAssets\\MonsterStats.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String monsterLine;
            while ((monsterLine= bufferedReader.readLine()) != null) {
                String [] monsterData=monsterLine.split(" ");
                if(monsterData[0].toLowerCase().compareTo(monsterName.toLowerCase())==0){
                    monster.addAttribute(new Attribute("species",monsterName.toLowerCase()));
                    monster.addAttribute(new Attribute("maxHP",Integer.valueOf(monsterData[3])));
                    monster.addAttribute(new Attribute("currentHP",Integer.valueOf(monsterData[3])));
                    monster.addAttribute(new Attribute("maxMP",Integer.valueOf(monsterData[4])));
                    monster.addAttribute(new Attribute("currentMP",Integer.valueOf(monsterData[4])));
                    monster.addAttribute(new Attribute("AGI",Integer.valueOf(monsterData[7])));
                }
            }
            fileReader.close();
            return monster;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
