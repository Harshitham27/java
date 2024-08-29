package com.xworkz.data.things;

public class Shwetha {
	
	public void sell(WaterBottle waterBottle) {
		if(waterBottle!=null) {
			waterBottle.fill();
			waterBottle.empty();
			waterBottle.crush();
		}
		else {
			System.out.println("Water bottle is null");
		}
	}

}
