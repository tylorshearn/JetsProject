package com.skilldistilley.jets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class AirBase{
	
	public AirBase() {
		super();
	}
	
	public void example() {
		System.out.println(jetList);
	}
	
	private Collection<Jet> jetList = new ArrayList<>();
	public Collection<Jet> readJetsFromFile(String fileName) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] lineArray = line.split(",");
				System.out.println(lineArray[0]);
				System.out.println(lineArray[1]);
				System.out.println(lineArray[2]);
				System.out.println(lineArray[3]);
				System.out.println(lineArray[4]);
				System.out.println();
				//use data in line array to create single jet
				//add that jet to jetList
				//call constructor conditionally
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
	return jetList;
	}
}
	
	
	
	
	
	
		
		

