package com.skilldistilley.jets;

public class BlueAngel extends Jet implements Pilots {

	public BlueAngel() {
		super();
	}

	public BlueAngel(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}
	
	public void barrelRoll() {
		System.out.println("BlueAngels have been activated... Air show is commencing.");
		System.out.println("~~~>");
		System.out.println("~~~~>");
		System.out.println("~~~>");
	}
}
