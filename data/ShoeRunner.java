package com.xworkz.data;

import com.xworkz.data.things.Divya;
import com.xworkz.data.things.Harshitha;
import com.xworkz.data.things.Omkar;
import com.xworkz.data.things.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {
		Divya divya=new Divya();
		divya.wear();
		Omkar omkar=new Omkar();
		Shoe shoe=new Shoe();
		omkar.tear(shoe);
		Harshitha harshitha=new Harshitha();
		harshitha.shoe=new Shoe();
		harshitha.wash();
	}

}
