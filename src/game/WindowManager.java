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
        ui.playerStatsPanel.setVisible(false);
        ui.actionButtonPanel.setVisible(false);
        ui.battleTextPanel.setVisible(false);
        ui.enemyStatsPanel.setVisible(false);
    }

    public void titleToStart(){
        ui.mainTextPanel.setVisible(true);
        ui.choicePanel.setVisible(true);
        ui.titlePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
    }
    public void showBattleUI(){
        ui.mainTextPanel.setVisible(false);
        ui.choicePanel.setVisible(false);
        ui.titlePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);



        ui.playerStatsPanel.setVisible(true);
        ui.actionButtonPanel.setVisible(true);
        ui.battleTextPanel.setVisible(true);
        ui.enemyStatsPanel.setVisible(true);
    }

    public void activateSpellMenu(){
        if(!ui.spellPanel.isVisible()){
            ui.spellPanel.setVisible(true);
        }else{
            ui.spellPanel.setVisible(false);
        }
    }




}
