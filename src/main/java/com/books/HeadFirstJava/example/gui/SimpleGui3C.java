package com.books.HeadFirstJava.example.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        JButton northButton = new JButton("North");
        JButton westButton = new JButton("West");
        JButton eastButton = new JButton("East");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.NORTH, northButton);
        frame.getContentPane().add(BorderLayout.WEST, westButton);
        frame.getContentPane().add(BorderLayout.EAST, eastButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(700, 700);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        frame.repaint();
    }
}
