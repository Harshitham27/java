package com.xworkz.inheritance;

import com.xworkz.inheritance.elements.Android;
import com.xworkz.inheritance.elements.SmartPhone;

public class SmartPhoneRunner {

	public static void main(String[] args) {
	
		Android android = new Android();
		android.brand = "Vivo";
		android.model = "Vivo y200";
		android.supports5G = true;
		android.price= 25000;
		android.call();
		android.display();

		SmartPhone smartPhone = new Android();
		smartPhone.brand = "Samsung";
		smartPhone.model = "Galaxy M35";
		smartPhone.supports5G = true;
		smartPhone.price= 24000;
		smartPhone.call();
		smartPhone.display();
	}

}
