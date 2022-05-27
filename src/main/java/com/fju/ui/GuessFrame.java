package com.fju.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //Fields
    JButton button = new JButton("ok");
    JLabel label = new JLabel("123");
    //Constructors
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("Hi");
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }






    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();

    }
}
