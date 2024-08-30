package com.xworkz.datatypes.things;

public class Dboss {
	
	public Gun gun;
	
	public void threat() {
		if(gun!=null) {
			gun.fire();
			gun.display();
		}
		else {
			System.out.println("Gun is null");
		}
	}

}
