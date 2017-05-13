/**
 * Created by Trevor Yovaish on 3/4/2017.
 */


public class Monster {
    MonsterStats monsterStats;
    private String monsterName;
    private int monsterType;
    private int monsterSpecies;
    private boolean isDead;
    private boolean ownedByPlayer;

    public void levelUp() {

    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public int getMonsterSpecies() {

        return monsterSpecies;
    }

    public void setMonsterSpecies(int monsterSpecies) {

        this.monsterSpecies = monsterSpecies;
    }

    public int getMonsterType() {

        return monsterType;
    }

    public void setMonsterType(int monsterType) {

        this.monsterType = monsterType;
    }

    public String getMonsterName() {

        return monsterName;
    }

    public void setMonsterName(String monsterName) {

        this.monsterName = monsterName;
    }

    public boolean isOwnedByPlayer() {

        return ownedByPlayer;
    }

    public void setOwnedByPlayer(boolean ownedByPlayer) {

        this.ownedByPlayer = ownedByPlayer;
    }
}
