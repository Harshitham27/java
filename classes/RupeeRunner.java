class RupeeRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in RupeeRunner");
		Rupee rupee=new Rupee();
		int value=rupee.value;
		String side=rupee.side;
		boolean head=rupee.Head;
		System.out.println("Rupee value:"+value);
		System.out.println("Rupee side:"+side);
		System.out.println("Rupee head:"+head);
		
		AirCondition airCondition=new AirCondition();
		String brand=airCondition.brand;
		double price=airCondition.price;
		String quality=airCondition.quality;
		System.out.println("AirCondition brand:"+brand);
		System.out.println("AirCondition price:"+price);
		System.out.println("AirCondition quality:"+quality);
		
		Autorikshaw autorikshaw=new Autorikshaw();
		String reg_no=autorikshaw.regNo;
		boolean available=autorikshaw.available;
		int no_of_seats=autorikshaw.noOfSeats;
		System.out.println("Autorikshaw reg_no:"+reg_no);
		System.out.println("Autorikshaw available:"+available);
		System.out.println("Autorikshaw no_of_seats:"+no_of_seats);
		
		AutoDriver autodriver=new AutoDriver();
		String name=autodriver.name;
		int age=autodriver.age;
		double salary=autodriver.salary;
		System.out.println("AutoDriver name:"+name);
		System.out.println("AutoDriver age:"+age);
		System.out.println("AutoDriver salary:"+salary);
		
		Rapido rapido=new Rapido();
		String username=rapido.name;
		int userphn_no=rapido.phnNo;
		boolean active=rapido.active;
		System.out.println("Rapido username:"+username);
		System.out.println("Rapido phn_no:"+userphn_no);
		System.out.println("Rapido active:"+active);
		
		CabCompany cabcompany=new CabCompany();
		String company_name=cabcompany.name;
		int no_of_drivers=cabcompany.noOfDrivers;
		long contact_no=cabcompany.contactNo;
		System.out.println("CabCompany name:"+company_name);
		System.out.println("CabCompany no_of_drivers:"+no_of_drivers);
		System.out.println("CabCompany contact:"+contact_no);
		
		BMTC bmtc=new BMTC();
		String bus_no=bmtc.busNo;
		int capacity=bmtc.capacity;
		boolean available1=bmtc.available;
		System.out.println("BMTC bus_no:"+bus_no);
		System.out.println("BMTC capacity:"+capacity);
		System.out.println("BMTC available:"+available1);
		
		FoodDeliveryCompany fooddelivery=new FoodDeliveryCompany();
		String name1=fooddelivery.name;
		int no_of_order=fooddelivery.noOfOrders;
		double price1=fooddelivery.price;
		System.out.println("FoodDeliveryCompany name:"+name1);
		System.out.println("FoodDeliveryCompany no_of_orders:"+no_of_order);
		System.out.println("FoodDeliveryCompany price:"+price1);
		System.out.println("Start main in RupeeRunner");
	}
}