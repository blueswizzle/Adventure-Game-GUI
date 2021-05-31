package game;

import javax.swing.*;


public class Story  {
    Game game;
    UI ui;
    WindowManager wm;


    public Story(Game game,UI ui,WindowManager wm){
        this.game = game;
        this.ui = ui;
        this.wm = wm;
    }
    public void selectGamePosition(String gamePosition){
        switch(gamePosition){
            case "toIntro01" : introScene01(); break;
            case "toIntro02" : introScene02(); break;
            case "toIntro03" : introScene03(); break;
            case "player_Caldor_talkGuard00" : player_Caldor_talkGuard00(); break;
            case "player_Caldor_ignoreGuard00" : player_Caldor_ignoreGuard00(); break;
            case "toCaldor00" : caldor00(); break;
            case "toRiver00" : river00(); break;
            case "toRiver01" : river01(); break;
            case "toHollowAttack00" : hollowAttack00(); break;
            case "backToIntro00" : introScene00(); break;
            case "backToIntro01" : introScene01(); break;
            case "backToIntro02" : introScene02(); break;
            case "backToIntro03" : introScene03(); break;
            case "backToCaldor00" : caldor00(); break;
            case "backToRiver00" : river00(); break;
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
            ui.mainTextArea.setText("You're awoken at the sounds of twigs snapping and lots of movement in the brushes. It's dark so you can't see whatever is making all those sounds. You pass it off as just some foxes strutting" +
                " about, but then.......");

            ui.choice1.setText(" > ");
            ui.choice2.setText(" < ");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.gamePosition1 = "toHollowAttack00";
            game.gamePosition2 = "backToRiver00";
            game.gamePosition3 = "";
            game.gamePosition4 = "";
        }
        public void hollowAttack00(){

        }


    }













