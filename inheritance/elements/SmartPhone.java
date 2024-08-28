package com.xworkz.inheritance.elements;

public class SmartPhone {

	public String brand;
	public String model;
	public boolean supports5G;
	public double price;

	public SmartPhone() {
		System.out.println("Created Smartphone..");
	}

	public void call() {
		System.out.println("Running call");
	}

	public void display() {
		System.out.println("Running display");
		System.out.println("Smart phone brand:" + brand);
		System.out.println("Smart phone model:" + model);
		System.out.println("Smart phone supports 5G:" + supports5G);
		System.out.println("Smart phone price:" + price);
	}
}
