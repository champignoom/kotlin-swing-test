package com.champignoom;

import javax.swing.*;

public class Main {
    private JButton button1;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("wtf title");
        jFrame.setContentPane(new Main().mainPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
