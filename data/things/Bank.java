package com.xworkz.data.things;

public class Bank {
	
	public String name="SBI";
	public String location="Bangalore";

	public Bank() {
		System.out.println("Created bank with no-arg const..");
	}

	public void account() {
		System.out.println("Running account in bank");
	}

	public void loan() {
		System.out.println("Running loan in bank");
	}

	public void scholarship() {
		System.out.println("Running scholarship in bank");
	}

}


