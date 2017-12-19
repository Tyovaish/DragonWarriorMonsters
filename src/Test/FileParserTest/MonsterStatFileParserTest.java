package Test.FileParserTest;

import Model.Monster.Monster;
import Model.Monster.MonsterFactory.MonsterBuilder;

public class MonsterStatFileParserTest {
    public static void main(String [] args){
        MonsterBuilder monsterBuilder=new MonsterBuilder();
        Monster slime=monsterBuilder.createMonster("andreal");
        System.out.println("HP: "+slime.getMaxHPStat());
        System.out.println("MP: "+slime.getMaxMPStat());
        System.out.println("AGI: "+slime.getMaxAGIStat());

    }
}
