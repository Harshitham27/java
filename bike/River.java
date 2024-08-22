package com.xworkz.bike;

public class River {
	
	private String[] riverNames=new String[7];
	private int value=0;
	
	public void store(String riverName)
	{
		riverNames[value]=riverName;
		value++;
	}
	
	public void display()
	{
		for(String ref:riverNames)
		{
			System.out.println("River name:"+ref);
		}
	}

}
