package com.LimoB.innit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.html.*;
import javafx.application.*;
import javafx.embed.swing.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.web.*;
import javafx.stage.*;

public class LimoBrowser {
    private JFrame frame;
    private JTabbedPane tabs;
    private JPanel panel1;
    private JPanel panel2;
    private JButton button;
    private JPanel panel;

    public LimoBrowser(String title) {
        frame = new JFrame();
        frame.setTitle(title);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);

        panel1 = new BrowserTab().innitTab();
        panel2 = new JPanel();

        button = new JButton();

        tabs = new JTabbedPane();
        tabs.addTab("Tab 1", panel1);
        tabs.addTab("Tab 2", panel2);
        tabs.addTab("+", button);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                panel = new BrowserTab().innitTab();
                tabs.addTab("New Tab", panel);
            }

        });
        tabs.setBackground(Color.BLACK);
        tabs.setBorder(BorderFactory.createEmptyBorder());

        frame.add(tabs);
    }

    public static void main(String[] args) {
        new LimoBrowser("Limo Browser - test v1");
    }
}
