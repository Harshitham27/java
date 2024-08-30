package com.xworkz.datatypes.things;

public class Lakshmi {
	
	public void wash(WashingMachine washingMachine) {
		if(washingMachine!=null) {
			washingMachine.rinse();
			washingMachine.show();
		}
		else {
			System.out.println("Washing machine is null");
		}
	}

}
