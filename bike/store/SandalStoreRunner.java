package com.xworkz.bike.store;

import com.xworkz.bike.Sandal;
import com.xworkz.bike.SandalStore;

public class SandalStoreRunner {

	public static void main(String[] args) {
		
		SandalStore data=new SandalStore();
		data.store(null);
		Sandal datas=new Sandal("Birkenstock",'s',12000,"White");
		Sandal datas1=new Sandal("Adidas",'M',1200,"Black");
		Sandal datas2=new Sandal("Bata",'s',1000,"White");
		Sandal datas3=new Sandal("Aldo",'s',5000,"White");
		Sandal datas4=new Sandal("Nike",'M',12000,"White");
		datas.display();
		datas1.display();
		datas2.display();
		datas3.display();
		datas4.display();
	}

}
