package com.xworkz.bike.store;

import com.xworkz.bike.Bike;

public class BikeRunner {

	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.store("Jawa42");
		bike1.store("Royal enfield");
		bike1.store("Activa");
		bike1.store("KTM 200 Duke");
		bike1.store("R15");
		bike1.store("Shine");
		bike1.store("Ola");
		bike1.display();
	}

}
