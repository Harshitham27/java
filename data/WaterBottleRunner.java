package com.xworkz.data;

import com.xworkz.data.things.Devu;
import com.xworkz.data.things.Gunashree;
import com.xworkz.data.things.Shwetha;
import com.xworkz.data.things.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		
		Gunashree gunashree=new Gunashree();
		gunashree.broke();
		Shwetha shwetha=new Shwetha();
		WaterBottle waterBottle=new WaterBottle();
		shwetha.sell(waterBottle);
		Devu devu=new Devu();
		devu.waterBottle=new WaterBottle();
		devu.drop();
	}

}
