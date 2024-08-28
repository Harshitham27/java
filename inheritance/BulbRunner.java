package com.xworkz.inheritance;

import com.xworkz.inheritance.elements.Bulb;
import com.xworkz.inheritance.elements.LedBulb;

public class BulbRunner {

	public static void main(String[] args) {
		
		LedBulb ledBulb=new LedBulb();
		ledBulb.watts=40;
		ledBulb.bright();
		
		Bulb bulb=new LedBulb();
		bulb.watts=20;
		bulb.bright();
	}

}
