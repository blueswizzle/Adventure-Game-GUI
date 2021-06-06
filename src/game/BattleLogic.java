package game;

import java.util.Random;

public class BattleLogic {
    Player player;
    Monster monster;
    UI ui;
    Game game;
    Random random = new Random();
    AudioManager am;
    public BattleLogic(Player player, Monster monster, UI ui, AudioManager am, Game game){
        this.player = player;
        this.monster = monster;
        this.ui = ui;
        this.game = game;
        this.am = am;
    }

    public boolean playerTurn(){
        int roll = random.nextInt(2);
        if(roll == 0){
            return true;
        }else{
            return false;
        }
    }
    public void startBattle(){
        ui.battleTextArea.setText("You choose to stand and fight the " + monster.getName() + "! You unsheathe your sword and set your focus on the enemy!");
    }
    public void playerCastFireball() throws InterruptedException {
        if(playerTurn()){
            int spellCost = 15;
            if(player.getMana() > spellCost){
                ui.battleTextArea.setText("You gather magical energy in your hands. The energy takes shape and forms a fireball. You take aim and fire " +
                        "it at the " + monster.getName() + " setting it ablaze!");
                int damageDealt = 20 + random.nextInt(6);
                monster.setHealth(monster.getHealth() - damageDealt);
                player.setMana(player.getMana() - spellCost);
                am.playFireball();
            }else{
                ui.battleTextArea.setText("You try to gather your remaining magical energy it your hands to cast a spell but you just don't have enough!");
            }
        }else{
            monsterAttack();
        }
        setLabels();
    }
    public void playerCastHeal(){
        if(playerTurn()){
            int spellCost = 45;
            if(player.getMana() > spellCost){
                ui.battleTextArea.setText("You gather magical energy in the your hands. Once enough has gathered you cast a healing spell that surrounds you" +
                        " in a golden aura that heals your wounds. \n\n**Plus 45 health!**");
                if(player.getHealth() + 45 > 100){
                    player.setHealth(100);
                    player.setMana(player.getMana() - spellCost);
                }else{
                    player.setHealth(player.getHealth() + 45);
                    player.setMana(player.getMana() - spellCost);
                }
            }else{
                ui.battleTextArea.setText("You try to heal yourself with a spell but you don't have enough magical energy!");
            }
        }else{
            monsterAttack();
        }
        setLabels();
    }

    public void playerLightAttack() throws InterruptedException {
        if(playerTurn()){
            int attackCost = player.lightAttackCost + random.nextInt(6);
            if(player.getStamina() > attackCost){
                int playerDamage = player.baseLightAttackDamage + random.nextInt(11);
                ui.battleTextArea.setText("You were able to move quicker than the " + monster.getName() + "! Like a coiled spring you moved quickly and precisely, transforming " +
                        "into a whirling storm of steel and violence, slashing away at the " + monster.getName() + " and tearing its " +
                        "flesh!");
                player.setStamina(player.getStamina() - attackCost);
                monster.setHealth(monster.getHealth()- playerDamage);
                am.playLightAttack();
            }else{
                ui.battleTextArea.setText("You try to attack but you don't have enough energy!");
            }

        }else{
            monsterAttack();
        }
        setLabels();

    }

    public void playerHeavyAttack()  {
        if(playerTurn()){
            int attackCost = player.heavyAttackCost + random.nextInt(6);
            if(player.getStamina() > attackCost){
                int playerDamage = player.baseHeavyAttackDamage + random.nextInt(11);
                ui.battleTextArea.setText("You are faster than the " + monster.getName() + "! You grip you the hilt of your sword with both hands and rush towards the " + monster.getName() + "! Your sword digs" +
                        " deep into its flesh injuring it greatly!");
                player.setStamina(player.getStamina() - attackCost);
                monster.setHealth(monster.getHealth() - playerDamage);
            }else{
                ui.battleTextArea.setText("You try to attack but you don't have enough energy!");
            }
        }else{
            monsterAttack();
        }
        setLabels();
    }

    public void monsterAttack(){
        int attackType = random.nextInt(3); // 0 = Light Attack, 1 = Heavy Attack, 2 = Beam Attack
        int damageDealt = 0;
        switch(attackType){
            case 0 :
                ui.battleTextArea.setText("The " + monster.getName() + " was faster than you! It lunged forward unleashing a fury of attacks with its claws and teeth! You guard against them" +
                        " but many slipped through, getting through the openings in your armor and cutting your flesh!");
                damageDealt = monster.baseLightAttackDamage + random.nextInt(8);
                player.setHealth(player.getHealth() - damageDealt);
                break;
            case 1 :
                damageDealt = monster.baseHeavyAttackDamage + random.nextInt(11);
                ui.battleTextArea.setText("The " + monster.getName() + " was faster than you! It lunged forward, swinging its claws with severe force. Your try to block its attacks but they prove too mighty " +
                        "damaging you greatly!");
                player.setHealth(player.getHealth() - damageDealt);
                break;
            case 2 :
                int beamHit = random.nextInt(2); // 0 = Beam hit, 1 = Beam didn't hit
                if(beamHit == 0){
                    ui.battleTextArea.setText("The " + monster.getName() + " charges up a ball of energy and fires it directly at you! You were unable to get away fast enough and suffered a direct hit!");
                    damageDealt = 25 + random.nextInt(6);
                    player.setHealth(player.getHealth() - damageDealt);
                }else{
                    ui.battleTextArea.setText("The " + monster.getName() + " charges up a ball of energy and fires it directly at you! Fortunately your instincts saved you from getting hit. You were able to dodge" +
                            " at the last possible second, the beam of energy barely slipping past your ear.");
                }
                break;

        }
    }
    public void playerUseHealthPotion(){
        if(player.getHealthPotion() !=0){
            ui.battleTextArea.setText("You drank a health potion!\n\n**Plus 35 HP**");
            player.drinkHealthPotion();
            setLabels();
        }else{
            ui.battleTextArea.setText("You ran out of health potions! Use a healing spell to restore your health!");
        }

    }
    public void playerUseStaminaPotion(){
        if(player.getStaminaPotion() !=0){
            ui.battleTextArea.setText("You drank a stamina potion!\n\n**Plus 35 SP**");
            player.drinkStaminaPotion();
            setLabels();
        }else{
            ui.battleTextArea.setText("You ran out of stamina potions!");
        }
    }
    public void playerUseManaPotion(){
        if(player.getManaPotion() !=0){
            ui.battleTextArea.setText("You drank a mana potion!\n\n**Plus 35 MP**");
            player.drinkManaPotion();
            setLabels();
        }else{
            ui.battleTextArea.setText("You ran out of mana potions!");
        }
    }

    public void checkDead(){
        if(player.isDead()){
            player.setHealth(0);
            ui.battleTextArea.setText("You have been killed by the " + monster.getName() + "!");
            ui.playerHPLabel.setText("Your HP: " + player.getHealth());
            ui.continueButton.setVisible(true);
        }else if (monster.isDead() && !player.isDead()){
            monster.setHealth(0);
            ui.battleTextArea.setText("You have killed the " + monster.getName() + "! The body lies dead in front of you. What a great victory! ");
            ui.enemyHPLabel.setText(monster.getName() + "'s HP: " + monster.getHealth());
            ui.continueButton.setVisible(true);
        }
    }

    public void setLabels(){
        ui.playerHPLabel.setText("Your HP: " + player.getHealth());
        ui.playerStaminaLabel.setText("Your Stamina: " + player.getStamina());
        ui.playerManaLabel.setText("Your Mana: " + player.getMana());
        ui.enemyHPLabel.setText(monster.getName() + "'s HP: " + monster.getHealth());
        ui.enemyStaminaLabel.setText(monster.getName() + "'s Stamina: " + monster.getStamina());
        ui.enemyManaLabel.setText(monster.getName() + "'s Mana: " + monster.getMana());
        ui.healthPotionButton.setText("HP: " + player.getHealthPotion());
        ui.staminaPotionButton.setText("SP: " + player.getStaminaPotion());
        ui.manaPotionButton.setText("MP: " + player.getManaPotion());
    }


}
