package com.fju.ui2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Win {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,600);
        jFrame.setLocation(250,50);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
        JButton button = new JButton("ok");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hi");
            }
        });
        JButton button1 = new JButton("Hello");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Ha");
            }
        });
        JButton button2 = new JButton("?");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("!!");
            }
        });
        jFrame.add(button);
        jFrame.add(button1);
        jFrame.add(button2);
        jFrame.setLayout(new FlowLayout());

    }
}
