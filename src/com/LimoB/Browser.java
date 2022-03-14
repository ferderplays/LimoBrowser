package com.LimoB;

public class Browser {
	
	public static Browser limob = new Browser("LimoB");
	public static boolean running;
	public String name;
	
	public Browser(String name) {
		this.name = name;
	}
	
	public static boolean isRunning() {
		if (running == true) {
			
		}
		return running;
	}
}