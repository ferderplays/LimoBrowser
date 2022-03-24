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

    public JFXPanel innitTab() {
    	JFXPanel tab = new JFXPanel();
        Platform.runLater(new Runnable() {
        	public void run() {
        		WebView www = new WebView();
        		www.getEngine().load("https://limobrowsernewtab.ferder.repl.co/tab/");
        		tab.setScene(new Scene(www));
        	}
        });
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
