package com.skilldistilley.jets;

public class JetsApp {
	AirBase airBase = new AirBase();
	
	public static void main(String[] args) {
		JetsApp jetApp = new JetsApp();
		jetApp.launch();
	}
	
	public void launch() {
		
		airBase.readJetsFromFile("jets.txt");
	}
}
		

