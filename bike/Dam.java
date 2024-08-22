package com.xworkz.bike;

public class Dam {
	
	private String[] damNames=new String[7];
	private int value=0;
	
	public void store(String damName)
	{
		damNames[value]=damName;
		value++;
	}
	
	public void display()
	{
		for(String ref:damNames)
		{
			System.out.println("Dam name:"+ref);
		}
	}


}
