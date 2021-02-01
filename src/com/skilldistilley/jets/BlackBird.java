package com.skilldistilley.jets;

public class BlackBird extends Jet implements FriendlyUAV{

	public BlackBird() {
		super();
	}

	public BlackBird(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}
	
	public void spy() {
		System.out.println("Activating BlackBird for reconnaissance mission... BlackBird is now en route to AO.");
	}
	
}
