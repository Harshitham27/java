package com.xworkz.data.things;

public class Devu {
	
	public WaterBottle waterBottle;
	
	public void drop() {
		if(waterBottle!=null) {
			System.out.println(waterBottle.quantity);
			System.out.println(waterBottle.color);
			waterBottle.fill();
			waterBottle.empty();
			waterBottle.crush();
		}
		else {
			System.out.println("Water bottle is null");
		}
	}

}
