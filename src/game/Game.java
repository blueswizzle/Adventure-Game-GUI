package game;



import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Game {
    ButtonHandler bHandler = new ButtonHandler();
    UI ui = new UI();
    WindowManager wm = new WindowManager(ui);
    String gamePosition1 ,gamePosition2, gamePosition3, gamePosition4;
    Story story = new Story(this,ui,wm);

    public Game() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        ui.createUI(bHandler);
        ui.createBattleUI();
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
    public static void main(String[]args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        new Game();
    }



}
