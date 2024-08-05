class AeroplaneRunner
{
	public static void main(String[] args)
	{
		Aeroplane aeroplane=new Aeroplane();
		System.out.println("Company:"+aeroplane.company);
		System.out.println("noOfSeats:"+aeroplane.noOfSeats);
		System.out.println("Ticket price:"+aeroplane.ticketPrice);
		System.out.println("Source:"+aeroplane.source);
		System.out.println("Destination:"+aeroplane.destination);
		
		Aeroplane aeroplane1=new Aeroplane("Airasia",1000,500,"India","Switzerland");
		System.out.println("Company:"+aeroplane1.company);
		System.out.println("noOfSeats:"+aeroplane1.noOfSeats);
		System.out.println("Ticket price:"+aeroplane1.ticketPrice);
		System.out.println("Source:"+aeroplane1.source);
		System.out.println("Destination:"+aeroplane1.destination);
		
		Aeroplane aeroplane2=new Aeroplane("Air India","Goa","London");
		System.out.println("Company:"+aeroplane2.company);
		System.out.println("Source:"+aeroplane2.source);
		System.out.println("Destination:"+aeroplane2.destination);
		
		Aeroplane aeroplane3=new Aeroplane("Spicejet",1000,"India","Australia");
		System.out.println("Company:"+aeroplane3.company);
		System.out.println("Ticket price:"+aeroplane3.ticketPrice);
		System.out.println("Source:"+aeroplane3.source);
		System.out.println("Destination:"+aeroplane3.destination);
	}
}