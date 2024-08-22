package com.xworkz.bike;

public class Sandal {
	
	private String brand;
	private char size;
	private double cost;
	private String color;
	
	public Sandal(String brand,char size,double cost,String color)
	{
		this.brand=brand;
		this.size=size;
		this.cost=cost;
		this.color=color;
	}
	
	public void display()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Size:"+size);
		System.out.println("Cost:"+cost);
		System.out.println("Color:"+color);
	}

}
