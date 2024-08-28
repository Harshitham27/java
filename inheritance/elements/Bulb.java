package com.xworkz.inheritance.elements;

public class Bulb {

	public int watts;

	public Bulb() {
		System.out.println("Created bulb with no-arg const..");
	}

	public void bright() {
		System.out.println("Running bright in Bulb");
		System.out.println("Watts:"+watts);
	}

}
