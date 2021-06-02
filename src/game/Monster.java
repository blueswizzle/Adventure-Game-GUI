package game;

public class Monster extends Player{
    public String name;


    public Monster(String name) {
        super();
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getStamina() {
        return super.getStamina();
    }

    @Override
    public void setStamina(int stamina) {
        super.setStamina(stamina);
    }

    @Override
    public int getMana() {
        return super.getMana();
    }

    @Override
    public void setMana(int mana) {
        super.setMana(mana);
    }

    @Override
    public boolean isDead() {
        return super.isDead();
    }
}
