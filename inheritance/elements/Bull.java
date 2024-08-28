package com.xworkz.inheritance.elements;

public class Bull {

	public String breed;
	public int age;
	public double weight;
	public String color;
	public boolean domesticated;

	public Bull() {
		System.out.println("Created Bull..");
	}

	public void graze() {
		System.out.println("Running graze");
	}

	public void feed() {
		System.out.println("Running feed");
	}

	public void steps() {
		System.out.println("Running steps");
	}

	public void roar() {
		System.out.println("Running roar");
	}

	public void print() {
		System.out.println("Running print");
		System.out.println("Bull breed:" + breed);
		System.out.println("Bull age:" + age);
		System.out.println("Bull weight:" + weight);
		System.out.println("Bull color:" + color);
		System.out.println("Bull isdomesticated:" + domesticated);
	}
}
