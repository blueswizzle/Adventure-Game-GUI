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
                    story.selectGamePosition(gamePosition1);
                    break;
                case "choice2" :
                    story.selectGamePosition(gamePosition2);
                    break;
                case "choice3" :
                    story.selectGamePosition(gamePosition3);
                    break;
                case "choice4" :
                    story.selectGamePosition(gamePosition4);
                    break;
            }
        }
    }
    public class ActionHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String userInput = e.getActionCommand();
            switch (userInput){
                case "lightAttack" : break;
                case "heavyAttack" : break;
                case "spell" : break;
                case "castFireball" : break;
                case "castHeal" : break;
            }
        }
    }
    public static void main(String[]args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        new Game();
    }



}
