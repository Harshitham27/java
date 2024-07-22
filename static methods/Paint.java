class Paint
{
	public static void primer(String brand)
	{
		System.out.println("Running primer in paint with string parameter");
		System.out.println("Brand:"+brand);
	}
	
	public static void coating(String brand, String color)
	{
		System.out.println("Running coating in paint with 2 string parameters");
		System.out.println("Brand:"+brand);
		System.out.println("Color:"+color);
	}
	
	public static void bargain(String brand, double price)
	{
		System.out.println("Running coating in paint with string and double parameters");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
	}
	
	public static void finish(String color,String type,double price)
	{
		System.out.println("Running coating in paint with 2 string and double parameters");
		System.out.println("Color:"+color);
		System.out.println("Type:"+type);
		System.out.println("Price:"+price);
	}
}