package com.fju.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        //extension
        JFrame jFrame = new JFrame();
        jFrame.setSize(600,400);
        jFrame.setLocation(300,200);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // add Component
        JButton button = new JButton("ok");
        //Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello");
            }
        });
        jFrame.setLayout(new FlowLayout());
        jFrame.add(button);
        //MyactionListner listner = new MyactionListner();
        //button.addActionListener(listner);
        jFrame.setVisible(true);
        System.out.println("end");
    }
}
