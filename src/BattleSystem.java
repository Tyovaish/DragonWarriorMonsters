/**
 * Created by Wendy Yovaish on 3/5/2017.
 */

import java.util.ArrayList;
import java.util.Random;

public class BattleSystem {
    public static void enterBattle(ArrayList<Monster> playerMonsters, ArrayList<Monster> enemyMonsters){
        while(checkIfOneMonstersIsAlive(playerMonsters)&&checkIfOneMonstersIsAlive(enemyMonsters)){
            ArrayList<Monster> currentMonsterTurnList=createMonsterTurnList(playerMonsters,enemyMonsters);
            MenuSystem.displayMonsterStatuses(playerMonsters,enemyMonsters);
            while(!currentMonsterTurnList.isEmpty()) {
                Monster nextMonsterToAttack = getNextAttackingMonster(currentMonsterTurnList);
                int monsterToBeAttacked=MenuSystem.displayMonsterChoices(nextMonsterToAttack,playerMonsters,enemyMonsters);

                if(playerMonsters.contains(nextMonsterToAttack))
                   damageToMonster(nextMonsterToAttack,toBeAttacked);
                } else{
                    damageToMonster(nextMonsterToAttack,toBeAttacked);
                }
                if(toBeAttacked.isDead()){
                   currentMonsterTurnList.remove(toBeAttacked);
                }
            }

        }

    }
    public static Monster getNextAttackingMonster(ArrayList<Monster> currentMonsterList){
        int currentMaxSpeed=currentMonsterList.get(0).getSpeed();
        Monster monsterToAttackNext=currentMonsterList.get(0);
        for(int i=0;i<currentMonsterList.size();i++){
            if(currentMonsterList.get(i).getSpeed()>currentMaxSpeed){
                currentMaxSpeed=currentMonsterList.get(i).getSpeed();
                monsterToAttackNext=currentMonsterList.get(i);
            }
        }
        currentMonsterList.remove(monsterToAttackNext);
        return monsterToAttackNext;
    }

    public static void damageToMonster(Monster source, Monster target){
        Random rand = new Random();
        int damageTaken = (source.getPhysicalAttack() - target.getPhysicalDefense() / 2 + (source.getPhysicalAttack()-  target.getPhysicalDefense() / 2 + 1) * rand.nextInt(255) / 256) / 4;
        System.out.println(damageTaken);
        target.setCurrentHP(target.getCurrentHP() - damageTaken);
        MenuSystem.displayDamageToMonster(source,target,damageTaken);
        target.isDead();
    }

    public static boolean checkIfOneMonstersIsAlive(ArrayList<Monster> monsterList){
        for(int i=0;i<monsterList.size();i++){
            if(!monsterList.get(i).isDead()){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Monster> createMonsterTurnList(ArrayList<Monster> playerMonsters, ArrayList<Monster> enemyMonsters){
        ArrayList<Monster> monsterTurnList=new ArrayList<Monster>();
        for(int i=0;i<playerMonsters.size();i++){
            if(!playerMonsters.get(i).isDead()){
                monsterTurnList.add(playerMonsters.get(i));
            }
        }
        for(int i=0;i<enemyMonsters.size();i++){
            if(!enemyMonsters.get(i).isDead()){
                monsterTurnList.add(enemyMonsters.get(i));
            }
        }
        return monsterTurnList;
    }

}
