package com.skilldistilley.jets;

import java.util.Scanner;

public class JetsApp {
	private Scanner kb = new Scanner(System.in);
	private AirBase airBase;

	public static void main(String[] args) {
		JetsApp jetApp = new JetsApp();
		String fileName = "jets.txt";
		jetApp.airBase = new AirBase(fileName);	
		jetApp.launch(fileName);
	}

	public void launch(String fileName) {
		displayMenu(fileName);
	}

	public void displayMenu(String fileName) {
		boolean keepGoing = true;
		while (keepGoing = true) {
		
		System.out.println("~~~~~MENU~~~~~");
		System.out.println("Input the number inside the quotation marks to execute the menu option of your choosing.");
		System.out.println("List fleet of jets to view the model, speed, range, and price of each existing jet: \"1\"");
		System.out.println("Fly all jets: \"2\"");
		System.out.println("View fastest jet: \"3\"");
		System.out.println("View jet with the longest range: \"4\"");
		System.out.println("Lead personnel onto COD for delivery to carrier: \"5\"");
		System.out.println("Scramble fighter jet for flyover: \"6\"");
		System.out.println("Activate BlackBird for reconnaissance mission: \"7\"");
		System.out.println("Activate Blue Angels for air show: \"8\"");
		System.out.println("Activate Training jet for training: \"9\"");
		System.out.println("Add a jet to the fleet: \"10\"");
		System.out.println("Remove a jet from the fleet: \"11\"");
		System.out.println("Quit the program: \"12\"");
		System.out.println();
		
		int intSwitch = 0;
		intSwitch = kb.nextInt();
		switch(intSwitch) {
		case 1:
		System.out.println("Fleet of jets en route to air base... ETA 17 minutes...");
		System.out.println();
		System.out.println("Fleet has arrived... Populating fleet...");
		System.out.println();
		airBase.listFleet();
		break;
		case 2:
		airBase.flyAllJets();	
		break;	
		case 3:
		airBase.viewFastestJet();
		break;
		case 4:
		airBase.viewJetLongestRange();
		break;
		case 5:
		airBase.loadPersonnelOnCod();
		break;
		case 6:
		airBase.scrambleForFlyover();	
		break;
		case 7:
		airBase.activateBlackBird();	
		break;
		case 8:
		airBase.activateBlueAngels();	
		break;
		case 9:
		airBase.activateTrainingJet();	
		break;
		case 10:	
		airBase.addJetToFleet();
		break;
		case 11:
		airBase.removeJetFromFleet();
		break;
		case 12:
		keepGoing = false;	
		kb.close();
		}
	}
	}
	}
