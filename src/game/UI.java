package game;

import javax.swing.*;
import java.awt.*;

public class UI {
    JFrame frame, battleFrame;
    JPanel titlePanel, startButtonPanel, mainTextPanel, choicePanel;
    JTextArea mainTextArea;
    JLabel titleLabel;
    JButton startButton, choice1, choice2, choice3, choice4;
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
        frame.setVisible(true);


    }

    public void createBattleUI(){
        battleFrame = new JFrame();
        battleFrame.setSize(1000,800);
        battleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        battleFrame.getContentPane().setBackground(Color.black);
        battleFrame.setLayout(null);
        battleFrame.setVisible(false);
    }




}
