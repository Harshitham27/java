package com.xworkz.inheritance;

import com.xworkz.inheritance.elements.Bull;
import com.xworkz.inheritance.elements.Cattle;

public class BullRunner {

	public static void main(String[] args) {
		Cattle cattle = new Cattle();
		cattle.breed = "Sahiwal";
		cattle.age = 15;
		cattle.weight = 30.5;
		cattle.color="Red";
		cattle.domesticated=true;
		cattle.graze();
		cattle.feed();
		cattle.steps();
		cattle.roar();
		cattle.print();
		
		Bull bull = new Cattle();
		bull.breed = "Gir";
		bull.age = 10;
		bull.weight = 25.5;
		bull.color="Brown";
		bull.domesticated=false;
		bull.graze();
		bull.feed();
		bull.steps();
		bull.roar();
		bull.print();
	}

}
