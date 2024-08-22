package com.xworkz.bike.store;


import com.xworkz.bike.River;

public class RiverRunner {

	public static void main(String[] args) {
		
		River river1=new River();
		river1.store("Ganga");
		river1.store("Tunga");
		river1.store("Yamuna");
		river1.store("Brahmaputra");
		river1.store("Kapila");
		river1.store("Indus");
		river1.store("Krishna");
		river1.display();


	}

}
