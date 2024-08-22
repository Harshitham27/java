package com.xworkz.bike;

public class Sweet {
	private String[] sweetNames=new String[7];
	private int value=0;
	
	public void store(String sweetName)
	{
		sweetNames[value]=sweetName;
		value++;
	}
	
	public void display()
	{
		for(String ref:sweetNames)
		{
			System.out.println("Sweet name:"+ref);
		}
	}


}
