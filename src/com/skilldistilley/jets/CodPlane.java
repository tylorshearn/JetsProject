package com.skilldistilley.jets;

public class CodPlane extends Jet implements AirCraftCarrier {

	public CodPlane() {
		super();
	}

	public CodPlane(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}
	
	public void loadPersonnel() {
		System.out.println("Loading personnel on COD for onboard delivery to carrier...");
	}
}
	

	
	
