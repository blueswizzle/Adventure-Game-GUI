package game;



public class Player {
    private int health;
    private int stamina;
    private int mana;
    public int baseLightAttackDamage;
    public int baseHeavyAttackDamage;
    public int lightAttackCost;
    public int heavyAttackCost;
    private int healthPotion = 2;
    private int staminaPotion = 2;
    private int manaPotion = 2;

    public Player() {
        this.health = 100;
        this.stamina = 100;
        this.mana = 100;
        baseLightAttackDamage = 10;
        baseHeavyAttackDamage = 20;
        lightAttackCost = 5;
        heavyAttackCost = 10;
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
    public boolean isDead(){
        if(this.health <= 0) return true;
        return false;
    }
    public int getHealthPotion(){
        return this.healthPotion;
    }
    public int getStaminaPotion(){
        return this.staminaPotion;
    }
    public int getManaPotion(){
        return this.manaPotion;
    }
    public void drinkHealthPotion(){
        if(getHealthPotion() !=0){
            if(this.getHealth() + 25 > 100){
                this.setHealth(100);
                healthPotion--;
            }else{
                this.setHealth(getHealth() + 25);
                healthPotion--;
            }
        }
    }
    public void drinkStaminaPotion(){
        if(getStaminaPotion() !=0){
            if(this.getStamina() + 35 > 100){
                this.setStamina(100);
                staminaPotion--;
            }else{
                this.setStamina(getStamina() + 35);
                staminaPotion--;
            }
        }
    }
    public void drinkManaPotion(){
        if(getManaPotion() !=0){
            if(this.getMana() + 35 > 100){
                this.setMana(100);
                manaPotion--;
            }else{
                this.setMana(getMana() + 35);
                manaPotion--;
            }
        }
    }
    public void setValues(int value){
        this.setHealth(value);
        this.setMana(value);
        this.setStamina(value);
    }



}
