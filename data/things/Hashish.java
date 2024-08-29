package com.xworkz.data.things;

public class Hashish {
	
	public void withdraw(Bank bank) {
		if(bank!=null) {
			bank.account();
			bank.loan();
			bank.scholarship();
		}
		else {
			System.out.println("Bank is null");
		}
	}

}
