package com.LimoB.innit;

import java.awt.event.ActionListener;

import javax.swing.*;

public class BrowserTab {

    private JTextField urlfield;

    public JPanel innitTab() {
        urlfield = new JTextField();
        JLabel label = new JLabel("New Tab");
        JButton button = new JButton("Test");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println("Limo Browser test v1.0.0");
            }

        });
        JPanel tab = new JPanel();
        tab.add(label);
        tab.add(button);
        tab.setBackground(java.awt.Color.BLACK);
        tab.setBorder(BorderFactory.createLineBorder(java.awt.Color.GREEN, 3));
        return tab;
    }
}
