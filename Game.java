
/**
 * Created by Trevor Yovaish on 3/4/2017.
 */

import java.util.ArrayList;

public class Game{
    public static void main(String [] args){
        ArrayList<Monster> p=new ArrayList<Monster>();
        ArrayList<Monster> e=new ArrayList<Monster>();
        p.add(MonsterFactory.createMonster(MonsterInfo.Slime));
        p.add(MonsterFactory.createMonster(MonsterInfo.DrakSlime));
        e.add(MonsterFactory.createMonster(MonsterInfo.Slime));
        e.add(MonsterFactory.createMonster(MonsterInfo.Slime));

        BattleSystem.enterBattle(p,e);

    }

}