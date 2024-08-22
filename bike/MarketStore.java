package com.xworkz.bike;

public class MarketStore {
	private Market[] market=new Market[5];
	private int value=0;
	
	public void store(Market name)
	{
		market[this.value]=name;
		this.value++;
	}
	
	public void show()
	{
		for(Market ref:market)
		{
			if(ref!=null)
			{
				ref.display();
			}
			else {
				System.out.println("Data is null");
			}
		}
	}

}
