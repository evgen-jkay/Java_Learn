package com.books.HeadFirstJava.example.gui;

import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(8, 7, 40, 40);
    }
}
