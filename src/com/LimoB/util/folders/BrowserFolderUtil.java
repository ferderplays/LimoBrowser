package com.LimoB.util.folders;

import java.io.File;

public class BrowserFolderUtil {
    // linux folders
    public static String folder_linux = System.getProperty("user.home") + "/.config/LimoDevelopment";
    public static File file_linux = new File(folder_linux);
    public static String folder2_linux = file_linux.getAbsolutePath() + "/LimoBrowser";
    public static File file2_linux = new File(folder2_linux);

    // win folders
    public static String folder_win = System.getProperty("user.home") + "/AppData/Local/LimoDevelopment";
    public static File file_win = new File(folder_win);
    public static String folder2_win = file_win.getAbsolutePath() + "/LimoBrowser";
    public static File file2_win = new File(folder2_win);

    public static void create() {
        String osname = System.getProperty("os.name");
        if (osname.toLowerCase().contains("win")) {
            if (!file_win.exists()) {
                if (file_win.mkdir()) {
                    System.out.println("Parent folder created.");
                    if (!file2_win.exists()) {
                        if (file2_win.mkdir()) {
                            System.out.println("Browser folder created.");
                        } else {
                            System.out.println("Error found!");
                        }
                    } else {
                        System.out.println("Browser folder already exists!");
                    }
                } else {
                    System.out.println("Error found!");
                }
            } else {
                System.out.println("Parent folder already exists!");
            }
        } else if (osname.toLowerCase().contains("linux")) {
            if (!file_linux.exists()) {
                if (file_linux.mkdir()) {
                    System.out.println("Parent folder created.");
                    if (!file2_linux.exists()) {
                        if (file2_linux.mkdir()) {
                            System.out.println("Browser folder created.");
                        } else {
                            System.out.println("Error found!");
                        }
                    } else {
                        System.out.println("Browser folder already exists!");
                    }
                } else {
                    System.out.println("Error found!");
                }
            } else {
                System.out.println("Parent folder already exists!");
            }
        }
    }

}
