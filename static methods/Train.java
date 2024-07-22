class Train
{
	public static void book(String source,String destination)
	{
		System.out.println("Runnung book in Train with two string parameters");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
	}
	
	public static void book(String source,String destination,int quantity)
	{
		System.out.println("Running book in Train with two string and int parameters");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Quantity:"+quantity);
	}
	
	public static void book(String source,String destination,int quantity,double price)
	{
		System.out.println("Running book in Train with two string and int and double parameters");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
	}
	
	public static void cancel(String ticketNo)
	{
		System.out.println("Running cancel in Train with string parameter");
		System.out.println("Ticket no:"+ticketNo);
	}
	
	public static void cancel(String source,String destination)
	{
		System.out.println("Runnung book in Train with two string parameters");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
	}
}