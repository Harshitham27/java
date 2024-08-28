package com.xworkz.inheritance;

import com.xworkz.inheritance.elements.Dessert;
import com.xworkz.inheritance.elements.Halwa;

public class HalwaRunner {

	public static void main(String[] args) {

		Dessert dessert = new Dessert();
		dessert.name = "Badam Halwa";
		dessert.quantity = 1;
		dessert.price = 250;
		dessert.sweet();
		dessert.cook();

		Halwa halwa = new Dessert();
		halwa.name = "Bombay Halwa";
		halwa.quantity = 2;
		halwa.price = 450;
		halwa.sweet();
		halwa.cook();
	}

}
