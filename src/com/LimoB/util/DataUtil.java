package com.LimoB.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

public class DataUtil {
	
	
	
	public static void WriteLog(File logfile, String content) {
		try {
			FileWriter writer = new FileWriter(logfile);
			JSONObject json = new JSONObject();
			json.put("content", content);
			writer.write(json.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
