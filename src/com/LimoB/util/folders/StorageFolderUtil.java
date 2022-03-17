package com.LimoB.util.folders;

import java.io.File;

public class StorageFolderUtil {
	// linux folders
	public static String folder3_linux = BrowserFolderUtil.file2_linux.getAbsolutePath() + "/Storage";
	public static File file3_linux = new File(folder3_linux);
	
	// win folders
	public static String folder3_win = BrowserFolderUtil.file2_win.getAbsolutePath() + "/Storage";
	public static File file3_win = new File(folder3_win);
	
	public static void create() {
		String osname = System.getProperty("os.name");
		if (osname.toLowerCase().contains("win")) {
			if (!file3_win.exists()) {
				if (file3_win.mkdir()) {
					System.out.println("Storage folder created.");
				} else {
					System.out.println("Error found!");
				}
			} else {
				System.out.println("Storage folder already exists!");
			}
		} else if (osname.toLowerCase().contains("linux")) {
			if (!file3_linux.exists()) {
				if (file3_linux.mkdir()) {
					System.out.println("Storage folder created.");
				} else {
					System.out.println("Error found!");
				}
			} else {
				System.out.println("Storage folder already exists!");
			}
		}
	}
}
