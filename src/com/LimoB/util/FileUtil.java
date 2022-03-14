package com.LimoB.util;

import java.io.*;
import java.net.*;

import com.LimoB.Browser;

public class FileUtil {

    public static String osname = System.getProperty("os.name");
    public static File browserfolder = new File(System.getenv("LOCALAPPDATA") + "/LimoB/");
    public static File user_datafolder = new File(browserfolder + "/User data");
    public static File data_storagefolder = new File(user_datafolder + "/Storage/");
    public static File data_logfile = new File(data_storagefolder + "1.log");
    
    public static void createExternalFileBase() {
    	try {
    		if (osname.toLowerCase().contains("win")) {
	            if (!browserfolder.exists()) browserfolder.createNewFile();
	            if (!user_datafolder.exists()) user_datafolder.createNewFile();
	        }
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    public static void execute() {
    	if (data_logfile.exists()) {
    		if (Browser.isRunning()) {
    			DataUtil.WriteLog(data_logfile, "[LimoB]: browser is running");
    		} else
    	}
    }
}