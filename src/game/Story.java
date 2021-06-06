package game;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;


public class Story  {
    Game game;
    UI ui;
    WindowManager wm;
    AudioManager am = new AudioManager();
    Player player = new Player();
    Monster monster;
    BattleLogic battle;

    public Story(Game game,UI ui,WindowManager wm) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        this.game = game;
        this.ui = ui;
        this.wm = wm;
    }
    public void selectGamePosition(String gamePosition) {
        switch(gamePosition){
            case "toIntro01" : introScene01(); break;
            case "toIntro02" : introScene02(); break;
            case "toIntro03" : introScene03(); break;
            case "player_Caldor_talkGuard00" : player_Caldor_talkGuard00(); break;
            case "player_Caldor_ignoreGuard00" : player_Caldor_ignoreGuard00(); break;
            case "toCaldor00" : caldor00(); break;
            case "toRiver00" : river00(); break;
            case "toRiver01" : river01(); break;
            case "toRiver02" : river02(); break;
            case "toWendigoAttack00" : wendigoAttack00(); break;
            case "fightWendigo" : fightWendigo();
            case "backToIntro00" : introScene00(); break;
            case "backToIntro01" : introScene01(); break;
            case "backToIntro02" : introScene02(); break;
            case "backToIntro03" : introScene03(); break;
            case "backToCaldor00" : caldor00(); break;
            case "backToRiver00" : river00(); break;
            case "backToRiver01" : river01(); break;
            case "backToRiver02" : river02(); break;
            case "toStartScreen" : wm.showTitleScreen(); break;
        }
    }

    public void selectBattleAction(String battleAction) throws InterruptedException {
        switch(battleAction){
            case "lightAttack" :
                battle.playerLightAttack();
                battle.checkDead();
                break;
            case "heavyAttack" :
                battle.playerHeavyAttack();
                battle.checkDead();
                break;
            case "castFireball" :
                battle.playerCastFireball();
                battle.checkDead();
                break;
            case "castHeal" :
                battle.playerCastHeal();
                battle.checkDead();
                break;
            case "drinkHealthPotion" :
                battle.playerUseHealthPotion();
                break;
            case "drinkManaPotion" :
                battle.playerUseManaPotion();
                break;
            case "drinkStaminaPotion" :
                battle.playerUseStaminaPotion();
                break;
            case "battleEnd" :
                afterWendigo();
                break;
        }
    }

    public void introScene00(){
        ui.mainTextArea.setText("You open your eyes and gaze upon the starry blue sky. It's a little past sunrise. " +
                "As you stand up you can feel the cool breeze graze your face. You quickly eat breakfast and gather your belongings so you can begin making your way to the nearest town, Caldor. " +
                "You've been wandering through the forest of Elwynn for a few weeks now, resulting in you missing human interaction.");
        ui.choice1.setText(" > ");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.gamePosition1 = "toIntro01";
        game.gamePosition2 = "";
        game.gamePosition3 = "";
        game.gamePosition4 = "";
    }
   public void introScene01(){
        ui.mainTextArea.setText("You make your way through the well-lit forest while keeping an eye out for any monsters. You haven't encountered any so far, but it's better to be cautious. Your armour" +
                " shakes and rattles, but the noise isn't so loud that it's going to attract every living thing near you. Caldor should be 15-20 minutes away at the current pace you're going.");

        ui.choice1.setText(" > ");
        ui.choice2.setText(" < ");
        ui.choice3.setText("");
        ui.choice3.setText("");

        game.gamePosition1 = "toIntro02";
        game.gamePosition2 = "backToIntro00";
        game.gamePosition3 = "";
        game.gamePosition4 = "";

    }
    public void introScene02(){
        ui.mainTextArea.setText("You've made it to Caldor, an impoverished town on the outskirts of Grimheart. The town walls are in disarray, and you can see that the borders are poorly defended. Most likely" +
                " monsters are a very real and common threat that the locals have to be wary off in their day to day lives. As you approach the front gate, two guards come forward to stop you. From their expressions" +
                " one can easily see that they hate being stationed all the way out in the boonies. No doubt that at the slightest threat of a monster or bandit raid, these guards will turn tail and run. So much for " +
                "keeping the peace and protecting the weak.");
        ui.choice1.setText(" > ");
        ui.choice2.setText(" < ");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.gamePosition1 = "toIntro03";
        game.gamePosition2 = "backToIntro01";
        game.gamePosition3 = "";
        game.gamePosition4 = "";

    }
    public void introScene03(){
        ui.mainTextArea.setText("'Who are you and what are you doing all the way out here?', one of them asks. The guards take note of your rugged appearance and become more wary of you." +
                " 'You here to cause trouble?', asks the other guard.");
        ui.choice1.setText("Talk to them");
        ui.choice2.setText("Ignore them and continue");
        ui.choice3.setText(" < ");
        ui.choice4.setText("");

        game.gamePosition1 = "player_Caldor_talkGuard00";
        game.gamePosition2 = "player_Caldor_ignoreGuard00";
        game.gamePosition3 = "backToIntro02";
        game.gamePosition4 = "";
    }
    public void player_Caldor_talkGuard00(){
        ui.mainTextArea.setText("'Look, I don't want any trouble. I'm just passing through here. Been wandering the forest for some time now, so I would like a place to eat and rest for a bit.', you say to the guards." +
                "\n\n'Is that so? Well, you've come to the wrong town to seek shelter in. We don't want you here.', replies the first guard. 'Turn around and leave!', the other guard barks as he shoves you away.");

        ui.choice1.setText(" > ");
        ui.choice2.setText(" < ");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.gamePosition1 = "toCaldor00";
        game.gamePosition2 = "backToIntro03";
        game.gamePosition3 = "";
        game.gamePosition4 = "";
    }
    public void player_Caldor_ignoreGuard00(){
        ui.mainTextArea.setText("Ignoring the two guards, you quickly shove past them to enter the town. But the guards quickly grab your shoulders from behind and fling you down to the ground." +
                "\n\n'What the hell do you think you're doing!', the first guard yells. 'Get out of here before things get ulgy!', yells the other guard. The two of them picks you up from the ground " +
                "and shove you away");

        ui.choice1.setText(" > ");
        ui.choice2.setText(" < ");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.gamePosition1 = "toCaldor00";
        game.gamePosition2 = "backToIntro03";
        game.gamePosition3 = "";
        game.gamePosition4 = "";
    }
    public void caldor00(){
        ui.mainTextArea.setText("You brush the dust off your clothes and leave Caldor heading west which, according to your map, should have a river. The walls of Caldor are lightly manned so you should be able" +
                " to sneak into the city at night. For now you decide to head to the river to get some water and rest until nightfall. There should be fish swimming in the river and the nearby wildlife" +
                " is plentiful enough that you won't have to worry about food.");

        ui.choice1.setText(" > ");
        ui.choice2.setText(" < ");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.gamePosition1 = "toRiver00";
        game.gamePosition2 = "backToIntro03";
        game.gamePosition3 = "";
        game.gamePosition4 = "";
    }
    public void river00(){
        ui.mainTextArea.setText("You spend the next few hours at the river fishing and gathering materials for a make-shift camp. After setting up camp, you check your armor and weapons. Everything is in order" +
                " so you quickly check the perimeters of your camp. Everything looks to be safe so you decide to take sleep until nightfall. Then you plan on sneaking your way into Caldor.");

        ui.choice1.setText(" > ");
        ui.choice2.setText(" < ");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.gamePosition1 = "toRiver01";
        game.gamePosition2 = "backToCaldor00";
        game.gamePosition3 = "";
        game.gamePosition4 = "";
    }
        public void river01(){
            ui.mainTextArea.setText("You're awoken at the sounds of twigs snapping and lots of movement in the brushes. It's dark so you can't see whatever is making all those sounds. You pass it off as just some foxes or some other small animals that are strutting" +
                " about but the sound of rustling becomes louder and more frequent. Your instincts tell you this isn't just some ordinary fox or rabbit having a late-night stroll in the woods. You get up and ready your sword, your eyes " +
                    "darting around trying to pick out whatever is out there.");

            ui.choice1.setText(" > ");
            ui.choice2.setText(" < ");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.gamePosition1 = "toRiver02";
            game.gamePosition2 = "backToRiver00";
            game.gamePosition3 = "";
            game.gamePosition4 = "";
        }
        public void river02(){
            ui.mainTextArea.setText("The rustling gets closer until it sounds like whatever is out there is only another 12 feet in front of you. Eventually the rustling stops. You finally catch a glimpse of the creature's eyes. They " +
                    "shine bright red through the bushes, and they're at least 7ft high up from the ground. The creature's head slowly emerges from the bushes.");

            ui.choice1.setText(" > ");
            ui.choice2.setText(" < ");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.gamePosition1 = "toWendigoAttack00";
            game.gamePosition2 = "backToRiver01";
            game.gamePosition3 = "";
            game.gamePosition4 = "";
        }


        public void wendigoAttack00()  {
            ui.mainTextArea.setText("!!!!");
            am.playWendigoRoar();
            ui.mainTextArea.setText("A terrible roar echoes through the woods. The hair on the back of your neck stands up. The wendigo completely emerges from the bushes, standing 7ft tall with leathery pale " +
                    "skin. It's head has antlers that were bloody, its eyes were glowing red and were sunken in, and its mouth filled razor sharp teeth. In a few moments it's going to leap forward and attack!" +
                    "\n\nWhat do you do?");
            ui.choice1.setText("Fight");
            ui.choice2.setText("Run Away!");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.gamePosition1 = "fightWendigo";
            game.gamePosition2 = "runWendigo";
            game.gamePosition3 = "";
            game.gamePosition4 = "";
        }
        public void fightWendigo(){
            monster = new Monster("Wendigo");
            battle = new BattleLogic(player,monster,ui,am,game);
            wm.showBattleUI();
            battle.startBattle();
            battle.setLabels();
            game.battleAction1 = "lightAttack";
            game.battleAction2 = "heavyAttack";
            game.battleAction3 = "castFireball";
            game.battleAction4 = "castHeal";
            game.battleAction5 = "drinkHealthPotion";
            game.battleAction6 = "drinkStaminaPotion";
            game.battleAction7 = "drinkManaPotion";
            game.battleEnd = "battleEnd";

        }
        public void afterWendigo(){
            wm.showNormalUI();
            if(player.isDead()){
                ui.mainTextArea.setText("The enemy proved too strong for you and thus you have been slain!\n\n Start over?");
            }else{
                ui.mainTextArea.setText("You have slain your enemy! Rejoice in you victory for this is one of many!\n\n Start Over?");
            }

                ui.choice1.setText("Back to Start");
                ui.choice2.setText("");
                ui.choice3.setText("");
                ui.choice4.setText("");

                game.gamePosition1 = "toStartScreen";
                game.gamePosition2 = "";
                game.gamePosition3 = "";
                game.gamePosition4 = "";

        }

    }














