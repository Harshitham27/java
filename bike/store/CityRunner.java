package com.xworkz.bike.store;

import com.xworkz.bike.City;

public class CityRunner {

	public static void main(String[] args) {
		
		City city1=new City();
		city1.store("Bangalore");
		city1.store("Hyderabad");
		city1.store("Mumbai");
		city1.store("Delhi");
		city1.store("Pune");
		city1.store("Chennai");
		city1.store("Ahemdabad");
		city1.display();

	}

}
