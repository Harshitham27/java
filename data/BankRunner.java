package com.xworkz.data;

import com.xworkz.data.things.Bank;
import com.xworkz.data.things.Hashish;
import com.xworkz.data.things.Jeevitha;
import com.xworkz.data.things.Sanvi;

public class BankRunner {

	public static void main(String[] args) {
	
		Jeevitha jeevitha=new Jeevitha();
		jeevitha.deposit();
		Hashish hashish=new Hashish();
		Bank bank=new Bank();
		hashish.withdraw(bank);
		Sanvi sanvi=new Sanvi();
		sanvi.bank=new Bank();
		sanvi.transact();

	}

}
