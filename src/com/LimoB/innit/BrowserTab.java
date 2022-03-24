package com.LimoB.innit;

import java.awt.event.ActionListener;

import javax.swing.*;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;

public class BrowserTab {

    private JTextField urlfield;

    public JPanel innitTab() {
        urlfield = new JTextField();
        JLabel label = new JLabel("New Tab");
        JButton button = new JButton("Test");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                // TODO Auto-generated method stub

            }

        });
        JPanel tab = new JPanel();
        tab.add(urlfield);
        tab.add(label);
        tab.add(button);
        tab.setBackground(java.awt.Color.BLACK);
        tab.setBorder(BorderFactory.createLineBorder(java.awt.Color.GREEN, 3));
        return tab;
    }
    
    public JFXPanel googletab() {
    	JFXPanel tab = new JFXPanel();
    	Platform.runLater(new Runnable() {
    		public void run() {
    			WebView www = new WebView();
    			www.getEngine().load("https://google.com");
    			tab.setScene(new Scene(www));
    		}
    	});
    	return tab;
    }
}
