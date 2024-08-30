package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Abhishek;
import com.xworkz.datatypes.things.Bhumika;
import com.xworkz.datatypes.things.Lakshmi;
import com.xworkz.datatypes.things.Megha;
import com.xworkz.datatypes.things.Nayana;
import com.xworkz.datatypes.things.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {

		Megha megha = new Megha();
		megha.clean();
		Lakshmi lakshmi = new Lakshmi();
		WashingMachine washingMachine = new WashingMachine("LG", "Automatic", 8);
		lakshmi.wash(washingMachine);
		Abhishek abhishek = new Abhishek();
		abhishek.washingMachine = new WashingMachine("Godrej", "Front load", 6.5);
		abhishek.dry();
		Bhumika bhumika = new Bhumika();
		if (bhumika != null) {
			bhumika.use();
		}
		Nayana nayana = new Nayana();
		nayana.buy();
	}

}
