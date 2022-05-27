package com.fju.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {

    //Fields
    JButton button = new JButton("Guess");
    JLabel label = new JLabel("123");
    JTextField number = new JTextField(7);
    Random random = new Random();
    int n = random.nextInt(10) + 1;
    //Constructors
    public GuessFrame(){
        super();
        System.out.println(n);
        setSize(600,400);
        setLocation(300,200);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if (num == n) {
                    label.setText("bingo");
                }else if (num < n){
                    label.setText("bigger");
                }else {
                    label.setText("smaller");
                }
                }
        });


        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }






    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}
