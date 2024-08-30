package com.xworkz.datatypes.things;

public class Sam {
	
public Car car;
	
	public void stop() {
		if(car!=null) {
			car.start();
			car.show();
		}
		else {
			System.out.println("Car is null");
		}
	}

}
