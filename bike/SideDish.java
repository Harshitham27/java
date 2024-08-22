package com.xworkz.bike;

public class SideDish {
	
	private String name;
	private double price;
	private String location;
	
	public SideDish(String name,double price,String location)
	{
		this.name=name;
		this.price=price;
		this.location=location;
	}
	
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Location:"+location);
	}

}
