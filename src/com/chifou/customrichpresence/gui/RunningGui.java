package com.chifou.customrichpresence.gui;

import javax.swing.*;
import java.awt.*;

public class RunningGui {

    private static JFrame frame = new JFrame("Rich Presense is running !");
    private static JPanel panel = (JPanel)frame.getContentPane();

    public static void display() {

        frame.setSize(500,500);
        panel.setLayout(null);

        panel.setBackground(Color.darkGray);

        JLabel isRunning = new JLabel("Discord rich presence is now running !");

        isRunning.setForeground(Color.white);

        isRunning.setBounds(250 - 116, 250, 250, 13);

        panel.add(isRunning);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public static void dispose() {
        frame.dispose();
    }
}
