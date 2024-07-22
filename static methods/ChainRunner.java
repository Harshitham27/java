class ChainRunner
{
	public static void main(String[] details)
	{
		System.out.println("Running main in ChainRunner");
		int carat=Chain.carat();
		System.out.println("Carat:"+carat);
		
		double price=Chain.costPerGram();
		System.out.println("Price per gram:"+price);
		
		String variety=Chain.type();
		System.out.println("Type:"+variety);
		
		String quality=Chain.quality();
		System.out.println("Quality:"+quality);
		
		int quantity=Chain.quantity();
		System.out.println("Quantity:"+quantity);
		
		double wastage=Chain.wastage();
		System.out.println("Wastage:"+wastage);
		
		double charge=Chain.serviceCharge();
		System.out.println("Service charge:"+charge);
		
		double GST=Chain.gst();
		System.out.println("GST:"+GST);
	}
}
