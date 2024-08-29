package com.xworkz.data.things;

public class Harshitha {

	public Shoe shoe;

	public void wash() {
		if (shoe != null) {
			shoe.safeGuard();
			shoe.enhanceWalk();
			System.out.println(shoe.brand);
			System.out.println(shoe.cost);
		} else {
			System.out.println("Shoe is null");
		}
	}

}
