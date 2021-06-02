package game;

import javax.swing.*;
import java.awt.*;

public class UI {
    JFrame frame, battleFrame;
    JPanel titlePanel, startButtonPanel, mainTextPanel, choicePanel, playerStatsPanel, actionButtonPanel, enemyStatsPanel, battleTextPanel, spellPanel;
    JTextArea mainTextArea, battleTextArea;
    JLabel titleLabel, playerHPLabel, playerStaminaLabel, playerManaLabel, enemyHPLabel, enemyStaminaLabel, enemyManaLabel;
    JButton startButton, choice1, choice2, choice3, choice4;
    JButton actionButton1, actionButton2, actionButton3, fireBallButton, healButton;
    Font titleFont = new Font("Felix Titling", Font.PLAIN,90);
    Font normalFont = new Font("Bell MT", Font.PLAIN,28);



    public void createUI(Game.ButtonHandler bHandler){
        frame = new JFrame();
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);


        titlePanel = new JPanel();
        titlePanel.setBackground(Color.black);
        titlePanel.setBounds(140,80,700,300);
        titleLabel = new JLabel("Grimheart");
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(Color.white);
        titlePanel.add(titleLabel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(410,500,150,200);
        startButtonPanel.setBackground(Color.black);
        startButton = new JButton("START");
        startButton.setFont(normalFont);
        startButton.setForeground(Color.black);
        startButton.setFocusPainted(false);
        startButton.setFocusable(false);
        startButtonPanel.add(startButton);

        mainTextPanel = new JPanel();
        mainTextPanel.setBackground(Color.black);
        mainTextPanel.setBounds(100,40,760,450);
        mainTextArea = new JTextArea("This is the main text area where most of the dialogue will take place in!");
        mainTextArea.setBounds(100,40,760,450);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        choicePanel = new JPanel();
        choicePanel.setBounds(340,550,500,200);
        choicePanel.setLayout(new GridLayout(4,1));
        choice1 = new JButton("Choice 1");
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choicePanel.add(choice1);
        choice2 = new JButton("Choice 2");
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choicePanel.add(choice2);
        choice3 = new JButton("Choice 3");
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choicePanel.add(choice3);
        choice4 = new JButton("Choice 4");
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choicePanel.add(choice4);
        choicePanel.setBackground(Color.black);

        startButton.addActionListener(bHandler);
        startButton.setActionCommand("start");
        choice1.addActionListener(bHandler);
        choice1.setActionCommand("choice1");
        choice2.addActionListener(bHandler);
        choice2.setActionCommand("choice2");
        choice3.addActionListener(bHandler);
        choice3.setActionCommand("choice3");
        choice4.addActionListener(bHandler);
        choice4.setActionCommand("choice4");

        frame.add(choicePanel);
        frame.add(mainTextPanel);
        frame.add(titlePanel);
        frame.add(startButtonPanel);
        frame.setResizable(false);
        frame.setVisible(false);


    }

    public void createBattleUI(){
        battleFrame = new JFrame();
        battleFrame.setSize(1000,800);
        battleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        battleFrame.getContentPane().setBackground(Color.black);
        battleFrame.setLayout(null);
        battleFrame.setVisible(true);

        playerStatsPanel = new JPanel();
        actionButtonPanel = new JPanel();
        enemyStatsPanel = new JPanel();
        battleTextPanel = new JPanel();
        spellPanel = new JPanel();

        int num = 100;
        playerStatsPanel.setBounds(0,550,300,250);
        playerHPLabel = new JLabel("Your HP: " + num);
        playerHPLabel.setFont(normalFont);
        playerHPLabel.setForeground(Color.green);
        playerStaminaLabel = new JLabel("Your Stamina: " + num);
        playerStaminaLabel.setFont(normalFont);
        playerStaminaLabel.setForeground(Color.green);
        playerManaLabel = new JLabel("Your Mana: " + num);
        playerManaLabel.setFont(normalFont);
        playerManaLabel.setForeground(Color.green);
        playerStatsPanel.add(playerHPLabel);
        playerStatsPanel.add(playerStaminaLabel);
        playerStatsPanel.add(playerManaLabel);

        actionButtonPanel.setBounds(365,550,250,250);
        actionButton1 = new JButton("Light Attack");
        actionButton1.setFont(normalFont);
        actionButton1.setBackground(Color.black);
        actionButton1.setForeground(Color.white);
        actionButton1.setFocusPainted(false);
        actionButton1.setActionCommand("lightAttack");
        actionButtonPanel.add(actionButton1);
        actionButton2 = new JButton("Heavy Attack");
        actionButton2.setFont(normalFont);
        actionButton2.setBackground(Color.black);
        actionButton2.setForeground(Color.white);
        actionButton2.setFocusPainted(false);
        actionButton2.setActionCommand("heavyAttack");
        actionButtonPanel.add(actionButton2);
        actionButton3 = new JButton("Cast Spell");
        actionButton3.setFont(normalFont);
        actionButton3.setBackground(Color.black);
        actionButton3.setForeground(Color.white);
        actionButton3.setActionCommand("castSpell");
        actionButton3.setFocusPainted(false);
        actionButtonPanel.add(actionButton3);

        spellPanel.setBounds(500,575,460,200);
        spellPanel.setBackground(Color.black);
        fireBallButton = new JButton("Fireball");
        fireBallButton.setFont(normalFont);
        fireBallButton.setBackground(Color.black);
        fireBallButton.setForeground(Color.white);
        fireBallButton.setFocusPainted(false);
        healButton = new JButton("Heal");
        healButton.setFont(normalFont);
        healButton.setBackground(Color.black);
        healButton.setForeground(Color.white);
        healButton.setFocusPainted(false);
        spellPanel.add(fireBallButton);
        spellPanel.add(healButton);
        spellPanel.setVisible(false);

        enemyStatsPanel.setBounds(660,25,300,250);
        enemyHPLabel = new JLabel("Wendigo's HP:" + num);
        enemyHPLabel.setFont(normalFont);
        enemyHPLabel.setForeground(Color.red);
        enemyStaminaLabel = new JLabel("Wendigo's Stamina: " + num);
        enemyStaminaLabel.setFont(normalFont);
        enemyStaminaLabel.setForeground(Color.red);
        enemyManaLabel = new JLabel("Wendigo's Mana: " + num);
        enemyManaLabel.setFont(normalFont);
        enemyManaLabel.setForeground(Color.red);
        enemyStatsPanel.add(enemyHPLabel);
        enemyStatsPanel.add(enemyStaminaLabel);
        enemyStatsPanel.add(enemyManaLabel);



        battleTextPanel.setBounds(10,25,600,500);
        battleTextPanel.setBackground(Color.black);
        battleTextArea = new JTextArea("This is the main battle text! Let's get this on, son! We bout to killing monsters up in here!");
        battleTextArea.setBounds(10,25,600,500);
        battleTextArea.setBackground(Color.black);
        battleTextArea.setForeground(Color.white);
        battleTextArea.setFont(normalFont);
        battleTextArea.setLineWrap(true);
        battleTextArea.setWrapStyleWord(true);
        battleTextArea.setEditable(false);
        battleTextPanel.add(battleTextArea);



        enemyStatsPanel.setBackground(Color.black);
        playerStatsPanel.setBackground(Color.black);
        actionButtonPanel.setBackground(Color.black);

        battleFrame.add(playerStatsPanel);
        battleFrame.add(actionButtonPanel);
        battleFrame.add(enemyStatsPanel);
        battleFrame.add(battleTextPanel);
        battleFrame.add(spellPanel);
    }




}
