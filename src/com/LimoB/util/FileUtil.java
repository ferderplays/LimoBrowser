package com.LimoB.util;

import java.io.*;
import java.net.*;

public class FileUtil {

    public static String osname = System.getProperty("os.name");
    
    public static void createExternalFileBase() {
        if (osname.toLowerCase().contains("win")) {
            File browserfolder = new File(System.getenv("LOCALAPPDATA") + "/LimoB/");
            File user_datafolder = new File(browserfolder + "/User data");
            File data_storagefolder = new File(user_datafolder + "/Storage/");
            File data_logfile = new File(data_storagefolder + "1.log");
            if (!browserfolder.exists()) {
                browserfolder.createNewFile();
            }
        }
    }
}