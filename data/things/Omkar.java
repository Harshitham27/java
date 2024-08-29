package com.xworkz.data.things;

public class Omkar {

	public void tear(Shoe shoe) {
		if (shoe != null) {
			shoe.safeGuard();
			shoe.enhanceWalk();
		} else {
			System.out.println("Shoe is null");
		}
	}

}
