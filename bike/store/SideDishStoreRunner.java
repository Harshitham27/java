package com.xworkz.bike.store;


import com.xworkz.bike.SideDish;
import com.xworkz.bike.SideDishStore;

public class SideDishStoreRunner {

	public static void main(String[] args) {
		
		SideDishStore data=new SideDishStore();
		data.store(null);
		SideDish datas=new SideDish("French fries",100,"Snack");
		SideDish datas1=new SideDish("Vegetable salad",200,"Salad");
		SideDish datas2=new SideDish("Panipuri",50,"Snack");
		SideDish datas3=new SideDish("Onion rings",80,"Side");
		SideDish datas4=new SideDish("Pizza",200,"Snack");
		datas.display();
		datas1.display();
		datas2.display();
		datas3.display();
		datas4.display();
	}

	}


