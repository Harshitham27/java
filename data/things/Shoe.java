package com.xworkz.data.things;

public class Shoe {
	
	public String brand="Puma";
	public double cost=5000;

	public Shoe() {
		System.out.println("Created shoe with no-arg const..");
	}

	public void safeGuard() {
		System.out.println("Running safeguard in shoe");
	}
	
	public void enhanceWalk() {
		System.out.println("Running enhance walk in shoe");
	}

}
