package game;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    ButtonHandler bHandler = new ButtonHandler();
    UI ui = new UI();
    WindowManager wm = new WindowManager(ui);
    String gamePosition1 ,gamePosition2, gamePosition3, gamePosition4;
    Story story = new Story(this,ui,wm);

    public Game(){
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
                case "choice1" : story.selectGamePosition(gamePosition1); break;
                case "choice2" : story.selectGamePosition(gamePosition2);break;
                case "choice3" : story.selectGamePosition(gamePosition3);break;
                case "choice4" : story.selectGamePosition(gamePosition4);break;
            }
        }
    }
    public static void main(String[]args){
        new Game();
    }



}
