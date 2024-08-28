package com.xworkz.inheritance.elements;

public class Chicken {
	public String name;
	public String breed;
	public int age;
	public String color;
	public boolean isLayingEggs;
	public double weight;
	public int noOfEggs;
	public double temperature;
	public String ownerName;
	public boolean isVaccinated;
	
	public Chicken() {
		System.out.println("Created Chicken..");
	}

	public void lay() {
		System.out.println("Running lay");
	}

	public void warm() {
		System.out.println("Running warm");
	}

	public void steps() {
		System.out.println("Running steps");
	}

	public void hunt() {
		System.out.println("Running hunt");
	}

	public void print() {
		System.out.println("Running print");
		System.out.println("Chicken name:" + name);
		System.out.println("Chicken breed:" + breed);
		System.out.println("Chicken age:" + age);
		System.out.println("Chicken color:" + color);
		System.out.println("Chicken isLayingEggs:" + isLayingEggs);
		System.out.println("Chicken weight:" + weight);
		System.out.println("Chicken noOfEggs:" + noOfEggs);
		System.out.println("Chicken temperature:" + temperature);
		System.out.println("Chicken owner name:" + ownerName);
		System.out.println("Chicken isvaccinated:" + isVaccinated);
	}

}
