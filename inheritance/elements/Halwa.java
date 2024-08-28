package com.xworkz.inheritance.elements;

public class Halwa {

	public String name;
	public int quantity;
	public double price;

	public Halwa() {
		System.out.println("Created Halwa with no-arg const..");
	}
	
	public void sweet() {
		System.out.println("Running sweet in Halwa");
	}

	public void cook() {
		System.out.println("The halwa is being cooked..");
		System.out.println("Sweet name:" + name);
		System.out.println("Sweet quantity:" + quantity);
		System.out.println("Sweet price:" + price);
	}

}
