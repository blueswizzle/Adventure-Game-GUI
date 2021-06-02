package game;



public class Player {
    private int health;
    private int stamina;
    private int mana;
    private int baseLightAttackDamage;
    private int baseHeavyAttackDamage;
    private int lightAttackCost;
    private int heavyAttackCost;


    public Player() {
        this.health = 100;
        this.stamina = 100;
        this.mana = 100;
        baseLightAttackDamage = 10;
        baseHeavyAttackDamage = 20;
        lightAttackCost = 10;
        heavyAttackCost = 20;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }



}
