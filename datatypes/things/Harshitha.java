package com.xworkz.datatypes.things;

public class Harshitha {
	
	public void wash(Car car) {
		if(car!=null) {
			car.start();
			car.show();
		}
		else {
			System.out.println("Car is null");
		}
	}

}
