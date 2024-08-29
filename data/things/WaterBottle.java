package com.xworkz.data.things;

public class WaterBottle {

	public int quantity=1;
	public String color="Blue";

	public WaterBottle() {
		System.out.println("Created water bottle with no-arg const..");
	}

	public void fill() {
		System.out.println("Running fill in Water bottle");
	}

	public void empty() {
		System.out.println("Running empty in Water bottle");
	}

	public void crush() {
		System.out.println("Running crush in Water bottle");
	}

}
