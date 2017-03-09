import java.util.ArrayList;

/**
 * Created by Wendy Yovaish on 3/5/2017.
 */
public class MenuSystem {
    public static void displayDamageToMonster(Monster source, Monster target, int damageTaken){
        System.out.println(target.getMonsterName()+" takes "+damageTaken+" damage from " + source.getMonsterName()+"!");
    }


    public static void displayMonsterStatuses(ArrayList<Monster> playerMonsters, ArrayList<Monster> enemyMonsters) {
        for (int i = 0; i < playerMonsters.size(); i++) {
            if(!playerMonsters.get(i).isDead())
            System.out.print(playerMonsters.get(i).getMonsterName() + "\t");
        }
        System.out.println();
        for (int i = 0; i < playerMonsters.size(); i++) {
            if(!playerMonsters.get(i).isDead())
            System.out.print("HP:" + playerMonsters.get(i).getCurrentHP() + "\t");
        }
        System.out.println();
        for (int i = 0; i < playerMonsters.size(); i++) {
            if(!playerMonsters.get(i).isDead())
            System.out.print("MP:" + playerMonsters.get(i).getCurrentMP() + "\t");
        }
        System.out.println();
        for (int i = 0; i < enemyMonsters.size(); i++) {
            if(!enemyMonsters.get(i).isDead())
            System.out.print(i+" "+enemyMonsters.get(i).getMonsterName() + "\t");
        }
        System.out.println();
        for (int i = 0; i < enemyMonsters.size(); i++) {
            if(!enemyMonsters.get(i).isDead())
                System.out.print("HP:" + enemyMonsters.get(i).getCurrentHP() + "\t");
        }
        System.out.println();
        for (int i = 0; i < enemyMonsters.size(); i++) {
            if(!enemyMonsters.get(i).isDead())
            System.out.print("MP:" + enemyMonsters.get(i).getCurrentMP() + "\t");
        }
        System.out.println();
    }
    public static void displayAttackBetweenMonsters(){

    }
}
