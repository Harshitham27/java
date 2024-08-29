package com.xworkz.data.things;

public class Sanvi {
	
	public Bank bank;
	
	public void transact() {
		if(bank!=null) {
			System.out.println(bank.name);
			System.out.println(bank.location);
			bank.account();
			bank.loan();
			bank.scholarship();
		}
		else {
			System.out.println("Bank is null");
		}
	}

}
