class Mall
{
	public static double price(String item)
	{
		System.out.println("Running price in Shop");
		System.out.println("Items:"+item);
		if (item=="Laptop")
		{
			double price1=60000;
			return price1;
		}
		else
		{
			return 0;
		}
    }
	public static double cost(String item)
	{
		System.out.println("Running price in Shop");
		System.out.println("Items:"+item);
		if (item=="Phone")
		{
			double price2=60000;
			return price2;
		}
		return 0;
	}
	public static void main(String[] args)
	{
		System.out.println("Items shopped in mall");
		return;
	}
}