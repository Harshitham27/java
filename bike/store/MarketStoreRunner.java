package com.xworkz.bike.store;

import com.xworkz.bike.Market;
import com.xworkz.bike.MarketStore;


public class MarketStoreRunner {

	public static void main(String[] args) {
		
		MarketStore data=new MarketStore();
		data.store(null);
		Market datas=new Market("Kr market","Bangalore");
		Market datas1=new Market("Koti","Hyderabad");
		Market datas2=new Market("Devaraja","Mysore");
		Market datas3=new Market("Chikpet","Bangalore");
		
		datas.display();
		datas1.display();
		datas2.display();
		datas3.display();
		
	}

	}
