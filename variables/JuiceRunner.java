class JuiceRunner
{
	public static void main(String[] values)
	{
		System.out.println("Running main in JuiceRunner");
		if(values.length==5)
		{
			String name=values[0];
			String brand=values[1];
			String flavour=values[2];
			String price=values[3];
			String quantity=values[4];
			double convertedPrice=Double.parseDouble(price);
			int convertedQuantity=Integer.parseInt(quantity);
			Juice.info(name,brand,flavour,convertedPrice,convertedQuantity);
		}
		else
		{
			System.out.println("Max 5 required");
		}
	}
}