class Biscuit
{
	public static void cookie(String brand)
	{
		System.out.println("Running cookie in Biscuit with string parameter");
		System.out.println("Brand:"+brand);
	}
	
	public static void creamy(String brand,double price)
	{
		System.out.println("Running cookie in Biscuit with string and double parameter");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
	}
	
	public static void sweet(String flavour,String type)
	{
		System.out.println("Running cookie in Biscuit with two string parameter");
		System.out.println("Brand:"+flavour);
		System.out.println("Type:"+type);
	}
	
	public static void salty(String batchCode,double price)
	{
		System.out.println("Running cookie in Biscuit with string and double parameter");
		System.out.println("Batch code:"+batchCode);
		System.out.println("Price:"+price);
	}
	
	public static void crunchy(String brand,int quantity,double price)
	{
		System.out.println("Running cookie in Biscuit with string,int and double parameter");
		System.out.println("Brand:"+brand);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
	}
}