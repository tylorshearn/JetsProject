package com.skilldistilley.jets;

public class Fighter extends Jet implements FlightOps{

	public Fighter() {
		super();
	}

	public Fighter(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}
	
	public void scramble() {
		System.out.println("Standby... Scrambling fighter jet for flyover.");
	}
}
