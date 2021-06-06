package game;



import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Game {
    ButtonHandler bHandler = new ButtonHandler();
    ActionHandler aHandler = new ActionHandler();



    UI ui = new UI();
    WindowManager wm = new WindowManager(ui);
    String gamePosition1 ,gamePosition2, gamePosition3, gamePosition4;
    String battleAction1, battleAction2, battleAction3, battleAction4, battleAction5, battleAction6, battleAction7, battleEnd;
    Story story = new Story(this,ui,wm);


    public Game() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        ui.createUI(bHandler);
        ui.createBattleUI(aHandler);
        wm.showTitleScreen();
    }
    public class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String userInput = e.getActionCommand();
            switch (userInput){
                case "start" : wm.titleToStart(); story.introScene00(); break;
                case "choice1" :
                    try {
                        story.selectGamePosition(gamePosition1);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
                case "choice2" :
                    try {
                        story.selectGamePosition(gamePosition2);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
                case "choice3" :
                    try {
                        story.selectGamePosition(gamePosition3);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
                case "choice4" :
                    try {
                        story.selectGamePosition(gamePosition4);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
            }
        }
    }
    public class ActionHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String userInput = e.getActionCommand();
            switch (userInput){
                case "lightAttack" :
                    try {
                        story.selectBattleAction(battleAction1);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
                case "heavyAttack" :
                    try {
                        story.selectBattleAction(battleAction2);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
                case "spell" :
                    wm.activateSpellMenu();
                    break;
                case "potionMenu" :
                    wm.activatePotionMenu();
                    break;
                case "castFireball" :
                    try {
                        story.selectBattleAction(battleAction3);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
                case "castHeal" :
                    try {
                        story.selectBattleAction(battleAction4);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
                case "drinkHealthPotion" :
                    try {
                        story.selectBattleAction(battleAction5);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
                case "drinkStaminaPotion" :
                    try {
                        story.selectBattleAction(battleAction6);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
                case "drinkManaPotion" :
                    try {
                        story.selectBattleAction(battleAction7);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
                case "battleEnd" :
                    try {
                        story.selectBattleAction(battleEnd);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;
            }
        }
    }
    public static void main(String[]args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        new Game();
    }



}
