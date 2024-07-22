class Shop
{
	public static String country(int code)
	{
		System.out.println("Running country in Shop");
		System.out.println("Code:"+code);
		if (code==91)
		{
			String country1="India";
			return country1;
		}
		else if (code==86)
		{
			String country2="China";
			return country2;
		}
		else if (code==852)
		{
			String country3="Hong Kong";
			return country3;
		}
		else if (code==81)
		{
			String country4="Japan";
			return country4;
		}
		else if (code==92)
		{
			String country5="Pakistan";
			return country5;
		}
		return "Not found";
	}
	public static double price(String item)
	{
		System.out.println("Running price in Shop");
		System.out.println("Items:"+item);
		if (item=="Laptop")
		{
			double price1=60000;
			return price1;
		}
		else if (item=="phone")
		{
			double price2=22000;
			return price2;
		}
		else if (item=="bottle")
		{
			double price3=100;
			return price3;
		}
		else if (item=="remote")
		{
			double price4=50;
			return price4;
		}
		else if (item=="cream")
		{
			double price5=600;
			return price5;
		}
		return 0;
	}
	public static String movie(String movieName)
	{
		System.out.println("Running movie in Shop");
		System.out.println("Movie name:"+movieName);
		if (movieName=="Kalki")
		{
			String producer1="Nag Ashwin";
			return producer1;
		}
		else if (movieName=="KGF")
		{
			String producer2="Vijay Kiragandur";
			return producer2;
		}
		else if (movieName=="Kaatera")
		{
			String producer3="Venkatesh";
			return producer3;
		}
		else if (movieName=="Kotee")
		{
			String producer4="Jyoti deshpande";
			return producer4;
		}
		else if (movieName=="Indian2")
		{
			String producer5="Subaskaran";
			return producer5;
		}
		return "Not found";
	}
}