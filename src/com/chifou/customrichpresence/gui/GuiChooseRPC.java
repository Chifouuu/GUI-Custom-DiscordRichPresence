package com.chifou.customrichpresence.gui;

import com.chifou.customrichpresence.events.EventSendButton;
import com.chifou.customrichpresence.utils.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiChooseRPC {

    private static JFrame frame = new JFrame("Put your discord appications informations !");
    private static JPanel panel = (JPanel) frame.getContentPane();

    public static void display() {

        frame.setSize(500,500);

        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);

        JLabel appId = new JLabel("Application Id");
        JLabel partyId = new JLabel("Party Id");
        JLabel token = new JLabel("Token");
        JLabel flavionFileName = new JLabel("Flavion file name");
        JLabel copyright = new JLabel("Copyright@Chifou2022");

        JButton sendButton = new JButton("Send");

        JTextField appIdField = new JTextField(10);
        JTextField partyIdField = new JTextField(10);
        JTextField tokenField = new JTextField(10);
        JTextField flavionFileNameField = new JTextField(10);

        appId.setForeground(Color.WHITE);
        partyId.setForeground(Color.WHITE);
        token.setForeground(Color.WHITE);
        flavionFileName.setForeground(Color.WHITE);
        copyright.setForeground(Color.WHITE);

        appId.setBounds(20, 20, 100, 20);
        partyId.setBounds(20, 50, 100, 20);
        token.setBounds(20, 80, 100, 20);
        flavionFileName.setBounds(20, 110, 100, 20);
        sendButton.setBounds(250 - 50, 445, 100 , 20);
        appIdField.setBounds(250 - 50, 20, 100 , 20);
        partyIdField.setBounds(250 - 50, 50, 100, 20);
        tokenField.setBounds(250 - 50, 80, 100, 20);
        flavionFileNameField.setBounds(250 - 50, 110, 100, 20);
        copyright.setBounds(10, 445, 150, 20);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String appId = appIdField.getText();
                String partyId = partyIdField.getText();
                String token = tokenField.getText();
                String flavionFileName = flavionFileNameField.getText();

                EventSendButton.eventListener(appId, partyId, token, flavionFileName);
            }
        });

        panel.add(appId);
        panel.add(partyId);
        panel.add(token);
        panel.add(flavionFileName);
        panel.add(sendButton);
        panel.add(appIdField);
        panel.add(partyIdField);
        panel.add(tokenField);
        panel.add(flavionFileNameField);
        panel.add(copyright);


        //settings frame

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }

    public static void dispose() {
        frame.dispose();
    }

}
