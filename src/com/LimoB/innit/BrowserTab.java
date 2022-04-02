package com.LimoB.innit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

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

    public JFXPanel innitTab() {
    	JFXPanel tab = new JFXPanel();
        Platform.runLater(new Runnable() {
        	public void run() {
        		WebView www = new WebView();
        		www.getEngine().load("https://limobrowsernewtab.ferder.repl.co/");
        		tab.setScene(new Scene(www));
        	}
        });
        tab.setBackground(Color.BLACK);
    	tab.setBorder(new LineBorder(Color.GREEN, 3));
        return tab;
    }
    
    public JPanel newtab() {
    	JPanel tab = new JPanel();
    	JButton button1 = new JButton("New Tab");
    	button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				JFXPanel panel = new BrowserTab().innitTab();
				LimoBrowser.tabs.addTab("New Tab", panel);
			}
    		
    	});
    	tab.add(button1);
    	return tab;
    }
}
