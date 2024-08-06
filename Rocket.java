class Rocket
{
	String country;
	int speed;
	double fuelCapacity;
	int noOfThrusters=5;
	
	public Rocket(String country)
	{
		this.country=country;
	}
	
	public void setRocket(int speed,double fuelCapacity)
	{
		this.speed=speed;
		this.fuelCapacity=fuelCapacity;
	}
	
	public void display()
	{
		System.out.println("Rocket country:"+this.country);
		System.out.println("Rocket speed:"+this.speed);
		System.out.println("Rocket fuelCapacity:"+this.fuelCapacity);
		System.out.println("Rocket noOfThrusters:"+this.noOfThrusters);
		System.out.println("=====");
	}
}