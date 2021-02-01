package com.skilldistilley.jets;

public class Trainer extends Jet implements TrainingSquadron {

	public Trainer() {
		super();
	}

	public Trainer(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}
	
	public void trainPilot() {
		System.out.println("Activating training jet... Harrier inbound on your AO.");
	}
}
