package com.xworkz.datatypes.things;

public class Car {
	
	private String name;
	private String color;
	private boolean hasSunroof;

	public Car() {
		System.out.println("Created car using no-arg const..");
	}

	public Car(String name, String color, boolean hasSunroof) {
		System.out.println("Created car using string and double const..");
		this.name=name;
		this.color=color;
		this.hasSunroof=hasSunroof;
	}

	public void start() {
		System.out.println("Running start in car");
	}

	public void show() {
		System.out.println("Car name:"+name);
		System.out.println("Car color:"+color);
		System.out.println("Sunroof:"+hasSunroof);
	}


}
