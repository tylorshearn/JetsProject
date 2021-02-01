package com.skilldistilley.jets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AirBase {
	Scanner kc = new Scanner(System.in);

	ArrayList <Jet> jetList;

	public AirBase(String fileName) {
		jetList = new ArrayList<>();

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			
			Jet a = null;

			String line;
			while ((line = reader.readLine()) != null) {
				String[] lineArray = line.split(",");
				if (lineArray[0].startsWith("Fight")) {
					a = new CodPlane(lineArray[0], lineArray[1], Double.parseDouble(lineArray[2]),
							Integer.parseInt(lineArray[3]), Long.parseLong(lineArray[4]));
				}
				else if (lineArray[0].startsWith("Blue")) {
					a = new Fighter(lineArray[0], lineArray[1], Double.parseDouble(lineArray[2]),
							Integer.parseInt(lineArray[3]), Long.parseLong(lineArray[4]));
				}
				else if (lineArray[0].startsWith("Black")) {
					a = new BlackBird(lineArray[0], lineArray[1], Double.parseDouble(lineArray[2]),
							Integer.parseInt(lineArray[3]), Long.parseLong(lineArray[4]));
				}
				else if (lineArray[0].startsWith("Cod")) {
					a = new BlueAngel(lineArray[0], lineArray[1], Double.parseDouble(lineArray[2]),
							Integer.parseInt(lineArray[3]), Long.parseLong(lineArray[4]));
				}
				else if (lineArray[0].startsWith("Trai")) {
					a = new Trainer(lineArray[0], lineArray[1], Double.parseDouble(lineArray[2]),
							Integer.parseInt(lineArray[3]), Long.parseLong(lineArray[4]));
				}
				else {
					a = new JetImplementation(lineArray[0], lineArray[1], Double.parseDouble(lineArray[2]),
							Integer.parseInt(lineArray[3]), Long.parseLong(lineArray[4]));
				}
				
				jetList.add(a);
				// use data in line array to create single jet
				// add that jet to jetList
				// call constructor conditionally
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void listFleet() {
		for (Jet jet: jetList) {
			System.out.println(jet);
		}
	}
		
	public void flyAllJets() {
		for (Jet jet: jetList) {
			jet.fly();
		}
	}
	public void viewFastestJet() {
		double fastestSpeed = 0;
		for (Jet jet: jetList) {
			if(fastestSpeed < jet.getSpeed()) {
				fastestSpeed = jet.getSpeed();
			}
		}
		for (Jet jet: jetList) {
			if(fastestSpeed == jet.getSpeed()) {
				System.out.println("The fastest jet is: " + jet.toString());
			}
		}
	}
	public void viewJetLongestRange() {
		double longestJetRange = 0;
		for (Jet jet: jetList) {
			if(longestJetRange < jet.getRange()) {
				longestJetRange = jet.getRange();
			}
		}
		for (Jet jet: jetList) {
			if(longestJetRange == jet.getRange()) {
				System.out.println("The jet with the longest range is: " + jet.toString());
			}
		}
	}
	public void loadPersonnelOnCod() {
		
		for (Jet jet: jetList) {
			if (jet instanceof CodPlane) {
				((CodPlane) jet).loadPersonnel();
				
			}
		}
	}
	public void scrambleForFlyover() {
		
		for (Jet jet: jetList) {
			if (jet instanceof Fighter) {
				((Fighter) jet).scramble();
				
			}
		}
	}
	public void activateBlackBird() {
		
		for (Jet jet: jetList) {
			if (jet instanceof BlackBird) {
				((BlackBird) jet).spy();
				
			}
		}
	}
	public void activateBlueAngels() {
		
		for (Jet jet: jetList) {
			if (jet instanceof BlueAngel) {
				((BlueAngel) jet).barrelRoll();
				
			}
		}
	}
	public void activateTrainingJet() {
		
		for (Jet jet: jetList) {
			if (jet instanceof Trainer) {
				((Trainer) jet).trainPilot();
				
			}
		}
	}
	public void addJetToFleet() {
    System.out.println("Enter the type of your jet: ");
	String type = kc.nextLine();
	System.out.println("Enter model of your jet: ");
	String model = kc.nextLine();
	System.out.println("Enter the speed of your jet in decimal notation: ");
	double speed = kc.nextDouble();
	System.out.println("Enter the range of your jet as a whole number: ");
	int range = kc.nextInt();
	System.out.println("Enter the price of your jet as a whole number(without a $ sign): ");
	long price = kc.nextLong();	
	Jet addJet = null;
	if(type.startsWith("")) {
	addJet = new JetImplementation(type, model, speed, range, price);
	
	}
	jetList.add(addJet);
	}
	
	public void removeJetFromFleet() {
		System.out.println("Choose which jet you would like to remove from the fleet by inputting the following jet number \n" +
	    "inside the quotation marks:");
		int jetNumber = 1;
		for (Jet jet: jetList) {
			System.out.println("\"" + jetNumber + "\"" + jet.toString());
			jetNumber++;	
	    }
		int jetChoice = kc.nextInt();
		if( jetChoice != 0 && jetChoice <= jetList.size()) {
		jetList.remove(jetChoice - 1);
		}
		
	}
}	
