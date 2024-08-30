package com.xworkz.datatypes.things;

public class Police {
	
	public void fire(Gun gun) {
		if(gun!=null) {
			gun.fire();
			gun.display();
		}
		else {
			System.out.println("Gun is null");
		}
	}

}
