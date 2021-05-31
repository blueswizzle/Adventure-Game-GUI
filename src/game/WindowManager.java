package game;

public class WindowManager {

    UI ui;


    public WindowManager(UI ui){
        this.ui = ui;
    }

    public void showTitleScreen(){
        ui.mainTextPanel.setVisible(false);
        ui.choicePanel.setVisible(false);
        ui.titlePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);
    }

    public void titleToStart(){
        ui.mainTextPanel.setVisible(true);
        ui.choicePanel.setVisible(true);
        ui.titlePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
    }




}
