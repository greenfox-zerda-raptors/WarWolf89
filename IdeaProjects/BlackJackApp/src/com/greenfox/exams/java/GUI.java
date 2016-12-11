package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by almasics on 2016.12.11..
 */
public class GUI extends JFrame {
    private JButton newGame, drawACard;
    private JLabel user, house;

    public GUI() {
        createGUI();
    }

    private void createGUI() {

        this.pack();
        this.setSize(new Dimension(600, 400));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setTitle("The BlackJackApp");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel blackJack = new JPanel();
        this.add(blackJack);
        blackJack.setSize(new Dimension(200, 400));

        user = new JLabel("Player played: ");
        house = new JLabel("House played: ");
        blackJack.add(user);
        blackJack.add(house);

        newGame = new JButton();
        newGame.addActionListener(new clearDeck());
        drawACard = new JButton();
        drawACard.addActionListener(new inputListener());
        blackJack.add(newGame);
        blackJack.add(drawACard);

    }

    private class inputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class clearDeck implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            user.setText("");
            house.setText("");
        }
    }
}

