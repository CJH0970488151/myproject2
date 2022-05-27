package com.fju.ui;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.Random;

public class GuessFrame2 extends JFrame {
    JButton button = new JButton("Guess");
    JLabel label = new JLabel("entry 1-100");
    JTextField number = new JTextField(7);
    Random random = new Random();
    int secret = random.nextInt(100) + 1;
    int min = 1 ;
    int max = 100;
    public GuessFrame2() {
        super();
        System.out.println("secret :"+ secret);
        setSize(600, 400);
        setLocation(300, 200);
        setLayout(new FlowLayout());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                if (num < secret) {
                    min = num;
                    label.setText("entry:" + min + "-" + max);
                } else if (num > secret) {
                    max = num;
                    label.setText("entry:" + min + "-" + max);
                } else {
                    label.setText("bingo");
                    }
                }
        });
        add(label);
        add(number);
        add(button);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        GuessFrame2 guess = new GuessFrame2();
    }
}
