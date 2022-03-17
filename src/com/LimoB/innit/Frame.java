package com.LimoB.innit;

import javax.swing.*;

import com.LimoB.util.folders.BrowserFolderUtil;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import java.awt.Color;
import java.awt.BorderLayout;

public class Frame extends JFrame implements Runnable {

    public JFXPanel panel;

    public void run() {
        setTitle("LimoBrowser by ferderplays");
        setVisible(true);
        panel = new JFXPanel();
        add(panel);
        panel.setBackground(Color.GREEN);
        Platform.runLater(() -> {
            WebView display = new WebView();
            display.getEngine().load("https://google.com/");
            panel.setScene(new Scene(display));
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Frame());
        BrowserFolderUtil.create();
    }

}
