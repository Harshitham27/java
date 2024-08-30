package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Car;
import com.xworkz.datatypes.things.Harshitha;
import com.xworkz.datatypes.things.Priya;
import com.xworkz.datatypes.things.Raj;
import com.xworkz.datatypes.things.Sam;

public class CarRunner {

	public static void main(String[] args) {
		
		Priya priya = new Priya();
		priya.park();
		Harshitha harshitha = new Harshitha();
		Car car = new Car("Maruti Suzuki", "Blue", false);
		harshitha.wash(car);
		Sam sam = new Sam();
		sam.car = new Car("Mercedes-Benz", "White", true);
		sam.stop();
		Raj raj = new Raj();
		if (raj != null) {
			raj.use();
		}
	}



}
