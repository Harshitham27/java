class MedicineRunner
{
	public static void main(String[] values)
	{
		System.out.println("Running main in MedicineRunner");
		if(values.length==4)
		{
			String name=values[0];
			String manfDate=values[1];
			String price=values[2];
			String quantity=values[3];
			double convertedPrice=Double.parseDouble(price);
			int convertedQuantity=Integer.parseInt(quantity);
			Medicine.info(name,manfDate,convertedPrice,convertedQuantity);
		}
		else
		{
			System.out.println("Max 4 required");
		}
	}
}