package com.LimoB.innit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.html.*;

import com.LimoB.util.files.FileUtil;

import javafx.application.*;
import javafx.embed.swing.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.web.*;
import javafx.stage.*;

public class LimoBrowser {
    public static JFrame frame;
    public static JTabbedPane tabs;
    public static JFXPanel panel1;
    public static JFXPanel panel2;
    public static JPanel panel3;
    public static JButton button;

    public LimoBrowser(String title) {
        frame = new JFrame();
        frame.setTitle(title);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);

        panel1 = new BrowserTab().innitTab();
        panel3 = new BrowserTab().newtab();

        tabs = new JTabbedPane();
        tabs.addTab("Main Tab", panel1);
        tabs.addTab("+", panel3);
        tabs.setBackground(Color.BLACK);
        tabs.setBorder(BorderFactory.createEmptyBorder());

        frame.add(tabs);
    }

    public static void main(String[] args) {
        new LimoBrowser("Limo Browser by ferderplays");
        FileUtil.createAllFiles();
    }
}
