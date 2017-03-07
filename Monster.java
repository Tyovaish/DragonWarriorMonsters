/**
 * Created by Trevor Yovaish on 3/4/2017.
 */


public class Monster {
    private String monsterName;
    private int monsterType;
    private int monsterSpecies;
    private boolean isDead;
    private boolean ownedByPlayer;
    private int maxHP;
    private int currentHP;
    private int maxMP;
    private int currentMP;
    private int level;
    private int physicalAttack;
    private int physicalDefense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private int experience;
    private double experienceGrowthRate;
    private double physicalAttackGrowthRate;
    private double physicalDefenseGrowthRate;
    private double specialAttackGrowthRate;
    private double specialDefenseGrowthRate;
    private double speedGrowthRate;

    public void levelUp() {

    }


    public double getSpecialDefenseGrowthRate() {

        return specialDefenseGrowthRate;
    }

    public void setSpecialDefenseGrowthRate(double specialDefenseGrowthRate) {

        this.specialDefenseGrowthRate = specialDefenseGrowthRate;
    }

    public double getSpeedGrowthRate() {
        return speedGrowthRate;
    }

    public void setSpeedGrowthRate(double speedGrowthRate) {
        this.speedGrowthRate = speedGrowthRate;
    }

    public double getSpecialAttackGrowthRate() {

        return specialAttackGrowthRate;
    }

    public void setSpecialAttackGrowthRate(double specialAttackGrowthRate) {

        this.specialAttackGrowthRate = specialAttackGrowthRate;
    }

    public double getPhysicalDefenseGrowthRate() {

        return physicalDefenseGrowthRate;
    }

    public void setPhysicalDefenseGrowthRate(double physicalDefenseGrowthRate) {

        this.physicalDefenseGrowthRate = physicalDefenseGrowthRate;
    }

    public double getPhysicalAttackGrowthRate() {

        return physicalAttackGrowthRate;
    }

    public void setPhysicalAttackGrowthRate(double physicalAttackGrowthRate) {

        this.physicalAttackGrowthRate = physicalAttackGrowthRate;
    }

    public double getExperienceGrowthRate() {

        return experienceGrowthRate;
    }

    public void setExperienceGrowthRate(double experienceGrowthRate) {

        this.experienceGrowthRate = experienceGrowthRate;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public int getLevel() {

        return level;
    }

    public void setLevel(int level) {

        this.level = level;
    }

    public boolean isDead() {
        if (currentHP <= 0) {
            isDead = true;
        }
        return isDead;
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

    public int getMaxHP() {

        return maxHP;
    }

    public void setMaxHP(int maxHP) {

        this.maxHP = maxHP;
    }

    public int getPhysicalDefense() {

        return physicalDefense;
    }

    public void setPhysicalDefense(int physicalDefense) {

        this.physicalDefense = physicalDefense;
    }

    public int getPhysicalAttack() {

        return physicalAttack;
    }

    public void setPhysicalAttack(int physicalAttack) {

        this.physicalAttack = physicalAttack;
    }

    public int getCurrentHP() {

        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
        if (currentHP <= 0) {
            isDead = true;
        }
    }

    public int getExperience() {

        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSpecialDefense() {

        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {

        this.specialDefense = specialDefense;
    }

    public int getSpecialAttack() {

        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {

        this.specialAttack = specialAttack;
    }


    public int getCurrentMP() {
        return currentMP;
    }

    public void setCurrentMP(int currentMP) {
        this.currentMP = currentMP;
    }

    public int getMaxMP() {

        return maxMP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }


}
