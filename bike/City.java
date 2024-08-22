package com.xworkz.bike;

public class City {
	private String[] cityNames=new String[7];
	private int value=0;
	
	public void store(String cityName)
	{
		cityNames[value]=cityName;
		value++;
	}
	
	public void display()
	{
		for(String ref:cityNames)
		{
			System.out.println("City name:"+ref);
		}
	}

}
