package com.skilldistilley.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet() {
		super();
	}

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
}
	
	
