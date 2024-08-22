package com.xworkz.bike;

public class Bike {
	
	private String[] bikeNames=new String[7];
	private int value=0;
	
	public void store(String bikeName)
	{
		bikeNames[value]=bikeName;
		value++;
	}
	
	public void display()
	{
		for(String ref:bikeNames)
		{
			System.out.println("Bike name:"+ref);
		}
	}

}
