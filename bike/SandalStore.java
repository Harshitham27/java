package com.xworkz.bike;

public class SandalStore {
	
	private Sandal[] sandalData=new Sandal[5];
	private int value=0;
	
	public void store(Sandal sandalName)
	{
		sandalData[this.value]=sandalName;
		this.value++;
	}
	
	public void show()
	{
		for(Sandal ref:sandalData)
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
