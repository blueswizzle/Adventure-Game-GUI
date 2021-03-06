package game;

import javax.swing.*;
import java.awt.*;

public class UI {
    JFrame frame, battleFrame;
    JPanel titlePanel, startButtonPanel, mainTextPanel, choicePanel, playerStatsPanel, actionButtonPanel, enemyStatsPanel, battleTextPanel, spellPanel,
            potionPanel;

    JTextArea mainTextArea, battleTextArea;
    JLabel titleLabel, playerHPLabel, playerStaminaLabel, playerManaLabel, enemyHPLabel,
            enemyStaminaLabel, enemyManaLabel;

    JButton startButton, choice1, choice2, choice3, choice4, continueButton;
    JButton actionButton1, actionButton2, actionButton3, actionButton4, fireBallButton, healButton,healthPotionButton, staminaPotionButton, manaPotionButton;
    Font titleFont = new Font("Felix Titling", Font.PLAIN,90);
    Font normalFont = new Font("Bell MT", Font.PLAIN,28);
    Font battleFont = new Font("Bell MT", Font.PLAIN,25);


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
        choicePanel.setBounds(250,550,500,200);
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
        frame.setVisible(true);


    }

    public void createBattleUI(Game.ActionHandler aHandler){
        battleFrame = new JFrame();
        battleFrame.setSize(1000,800);
        battleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        battleFrame.getContentPane().setBackground(Color.black);
        battleFrame.setLayout(null);

        playerStatsPanel = new JPanel();
        actionButtonPanel = new JPanel();
        enemyStatsPanel = new JPanel();
        battleTextPanel = new JPanel();
        spellPanel = new JPanel();

        //////////////////////////////////////////////////////////////

        playerStatsPanel.setBounds(0,550,250,250);
        playerHPLabel = new JLabel();
        playerHPLabel.setFont(battleFont);
        playerHPLabel.setForeground(Color.green);
        playerStaminaLabel = new JLabel();
        playerStaminaLabel.setFont(battleFont);
        playerStaminaLabel.setForeground(Color.green);
        playerManaLabel = new JLabel();
        playerManaLabel.setFont(battleFont);
        playerManaLabel.setForeground(Color.green);
        playerStatsPanel.add(playerHPLabel);
        playerStatsPanel.add(playerStaminaLabel);
        playerStatsPanel.add(playerManaLabel);

        //////////////////////////////////////////////////////////////

        actionButtonPanel.setBounds(365,550,250,250);
        actionButton1 = new JButton("Light Attack");
        actionButton1.setFont(normalFont);
        actionButton1.setBackground(Color.black);
        actionButton1.setForeground(Color.white);
        actionButton1.setFocusPainted(false);
        actionButton1.addActionListener(aHandler);
        actionButton1.setActionCommand("lightAttack");
        actionButtonPanel.add(actionButton1);
        actionButton2 = new JButton("Heavy Attack");
        actionButton2.setFont(normalFont);
        actionButton2.setBackground(Color.black);
        actionButton2.setForeground(Color.white);
        actionButton2.setFocusPainted(false);
        actionButton2.addActionListener(aHandler);
        actionButton2.setActionCommand("heavyAttack");
        actionButtonPanel.add(actionButton2);
        actionButton3 = new JButton("Cast Spell");
        actionButton3.setFont(normalFont);
        actionButton3.setBackground(Color.black);
        actionButton3.setForeground(Color.white);
        actionButton3.addActionListener(aHandler);
        actionButton3.setActionCommand("spell");
        actionButton3.setFocusPainted(false);
        actionButtonPanel.add(actionButton3);
        actionButton4 = new JButton("Potion");
        actionButton4.setFont(normalFont);
        actionButton4.setBackground(Color.black);
        actionButton4.setForeground(Color.white);
        actionButton4.addActionListener(aHandler);
        actionButton4.setActionCommand("potionMenu");
        actionButton4.setFocusPainted(false);
        actionButtonPanel.add(actionButton4);

        //////////////////////////////////////////////////////////////

        spellPanel.setBounds(500,575,460,200);
        spellPanel.setBackground(Color.black);
        fireBallButton = new JButton("Fireball");
        fireBallButton.setFont(normalFont);
        fireBallButton.setBackground(Color.black);
        fireBallButton.setForeground(Color.white);
        fireBallButton.addActionListener(aHandler);
        fireBallButton.setActionCommand("castFireball");
        fireBallButton.setFocusPainted(false);
        healButton = new JButton("Heal");
        healButton.setFont(normalFont);
        healButton.setBackground(Color.black);
        healButton.setForeground(Color.white);
        healButton.addActionListener(aHandler);
        healButton.setActionCommand("castHeal");
        healButton.setFocusPainted(false);
        spellPanel.add(fireBallButton);
        spellPanel.add(healButton);
        spellPanel.setVisible(false);

        potionPanel = new JPanel();
        potionPanel.setBackground(Color.black);
        potionPanel.setBounds(550,600,460,200);

        healthPotionButton = new JButton("HP");
        healthPotionButton.setFont(normalFont);
        healthPotionButton.setBackground(Color.black);
        healthPotionButton.setForeground(Color.white);
        healthPotionButton.addActionListener(aHandler);
        healthPotionButton.setActionCommand("drinkHealthPotion");
        healthPotionButton.setFocusPainted(false);
        potionPanel.add(healthPotionButton);

        //////////////////////////////////////////////////////////////

        staminaPotionButton = new JButton("SP");
        staminaPotionButton.setFont(normalFont);
        staminaPotionButton.setBackground(Color.black);
        staminaPotionButton.setForeground(Color.white);
        staminaPotionButton.addActionListener(aHandler);
        staminaPotionButton.setActionCommand("drinkStaminaPotion");
        staminaPotionButton.setFocusPainted(false);
        potionPanel.add(staminaPotionButton);

        //////////////////////////////////////////////////////////////

        manaPotionButton = new JButton("MP");
        manaPotionButton.setFont(normalFont);
        manaPotionButton.setBackground(Color.black);
        manaPotionButton.setForeground(Color.white);
        manaPotionButton.addActionListener(aHandler);
        manaPotionButton.setActionCommand("drinkManaPotion");
        manaPotionButton.setFocusPainted(false);
        potionPanel.add(manaPotionButton);
        potionPanel.setVisible(false);

        //////////////////////////////////////////////////////////////

        enemyStatsPanel.setBounds(660,25,300,250);
        enemyHPLabel = new JLabel();
        enemyHPLabel.setFont(battleFont);
        enemyHPLabel.setForeground(Color.red);
        enemyStaminaLabel = new JLabel();
        enemyStaminaLabel.setFont(battleFont);
        enemyStaminaLabel.setForeground(Color.red);
        enemyManaLabel = new JLabel();
        enemyManaLabel.setFont(battleFont);
        enemyManaLabel.setForeground(Color.red);
        enemyStatsPanel.add(enemyHPLabel);
        enemyStatsPanel.add(enemyStaminaLabel);
        enemyStatsPanel.add(enemyManaLabel);

        //////////////////////////////////////////////////////////////

        battleTextPanel.setBounds(10,25,600,500);
        battleTextPanel.setBackground(Color.black);
        continueButton = new JButton("Continue");
        continueButton.setFont(normalFont);
        continueButton.setBackground(Color.black);
        continueButton.setForeground(Color.white);
        continueButton.addActionListener(aHandler);
        continueButton.setActionCommand("battleEnd");
        continueButton.setFocusPainted(false);
        continueButton.setVisible(false);
        battleTextArea = new JTextArea("This is the main battle text! Let's get this on, son! We bout to killing monsters up in here!");
        battleTextArea.setBounds(10,25,600,500);
        battleTextArea.setBackground(Color.black);
        battleTextArea.setForeground(Color.white);
        battleTextArea.setFont(normalFont);
        battleTextArea.setLineWrap(true);
        battleTextArea.setWrapStyleWord(true);
        battleTextArea.setEditable(false);
        battleTextPanel.add(battleTextArea);
        battleTextPanel.add(continueButton);

        //////////////////////////////////////////////////////////////

        enemyStatsPanel.setBackground(Color.black);
        playerStatsPanel.setBackground(Color.black);
        actionButtonPanel.setBackground(Color.black);

        //////////////////////////////////////////////////////////////

        frame.add(playerStatsPanel);
        frame.add(actionButtonPanel);
        frame.add(enemyStatsPanel);
        frame.add(battleTextPanel);
        frame.add(spellPanel);
        frame.add(potionPanel);

    }




}
