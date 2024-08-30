package com.xworkz.datatypes.things;

public class Abhishek {
	
public WashingMachine washingMachine;
	
	public void dry() {
		if(washingMachine!=null) {
			washingMachine.rinse();
			washingMachine.show();
		}
		else {
			System.out.println("Washing machine is null");
		}
	}

}
