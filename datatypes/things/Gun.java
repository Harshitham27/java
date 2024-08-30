package com.xworkz.datatypes.things;

public class Gun {

	private String name;
	private String countryMade;
	private String type;

	public Gun() {
		System.out.println("Created gun using no-arg const..");
	}

	public Gun(String name, String countryMade, String type) {
		System.out.println("Created gun using string const..");
		this.name=name;
		this.countryMade=countryMade;
		this.type=type;
	}

	public void fire() {
		System.out.println("Running fire in gun");
	}

	public void display() {
		System.out.println("Gun name:"+name);
		System.out.println("Gun country made:"+countryMade);
		System.out.println("Gun type:"+type);
	}

}
