package com.xworkz.bike;

public class SideDishStore {
	
	private SideDish[] sideDish=new SideDish[5];
	private int value=0;
	
	public void store(SideDish name)
	{
		sideDish[this.value]=name;
		this.value++;
	}
	
	public void show()
	{
		for(SideDish ref:sideDish)
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
