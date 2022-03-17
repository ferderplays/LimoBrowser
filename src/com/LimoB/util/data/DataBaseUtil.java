package com.LimoB.util.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

public class DataBaseUtil {
	// linux folders
	
	// win folders
	
	public static void create() {

	}
	
	public void writeDataToFile(File file, char username, char content) {
		try {
			FileWriter writer = new FileWriter(file);
			JSONObject json = new JSONObject();
			json.put("username", username);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}