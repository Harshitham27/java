class Buy
{
	public static void product(String brand,double price)
	{
		System.out.println("Brand:"+brand);
		if(price>100.0 && price<500.0)
		{
			System.out.println("Valid price";)
			System.out.println("Price:"+price);
		}
		else{
			System.out.println("Price:"+invalid price);
		}
		
	}	
	public static void product(String name,int quantity,String quality,double price)
	{
		System.out.println("Name:"+name);
		if(quantity>100 && quantity<200)
		{
			System.out.println("Valid quantity";)
			System.out.println("Quantity:"+quantity);
		}
		else{
			System.out.println("Quantity:"+invalid quantity);
		}
		System.out.println("Quality:"+quality);
		System.out.println("Price:"+price);
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("Name:"+name);
		System.out.println("Theater name:"+theaterName);
		System.out.println("Quantity:"+quantity);
		if(price>100.0 && price<500.0)
		{
			System.out.println("Valid price";)
			System.out.println("Price:"+price);
		}
		else{
			System.out.println("Price:"+invalid price);
		}
	}
	public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("Total:"+total);
		System.out.println("Price per Egg:"+pricePerEgg);
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("Quantity in Ml:"+quantityInMl);
		if(price>100.0 && price<500.0)
		{
			System.out.println("Valid price";)
			System.out.println("Price:"+price);
		}
		else{
			System.out.println("Price:"+invalid price);
		}
		System.out.println("Brand:"+brand);
		System.out.println("Manf date:"+manfDate);
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("Size:"+size);
		System.out.println("Type:"+type);
		System.out.println("Flavour:"+flavour);
		System.out.println("Cost:"+cost);
		System.out.println("Quantity:"+quantity);
	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("Brand:"+brand);
		System.out.println("Serial no:"+serialNo);
		System.out.println("Price:"+price);
		System.out.println("Battery Capacity:"+batteryCapacity);
		System.out.println("Screen Size:"+screenSize);
		System.out.println("OS:"+os);
		System.out.println("Hard disk Size:"+harddiskSize);
		System.out.println("Ram Size:"+ramSize);
	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		if(color==1)
		{
			System.out.println("Valid color");
			System.out.println("Color:blue");
		}
		if(color==2)
		{
			System.out.println("Valid color");
			System.out.println("Color:black");
		}
		else{
			System.out.println("Invalid color");
		}
		System.out.println("Type:"+type);
		if(mode==1)
		{
			System.out.println("Valid mode");
			System.out.println("Mode:Notification mode");
		}
		if(mode==2)
		{
			System.out.println("Valid mode");
			System.out.println("Mode:Sports mode");
		}
		
		
	}
}