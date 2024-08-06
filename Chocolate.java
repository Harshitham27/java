class Chocolate
{
	String brand="Kitkat";
	double price;
	String flavour;
	String size;
	
	public Chocolate(double price)
	{
		this.price=price;
	}
	
	public void setChocolate(String flavour,String size)
	{
		this.flavour=flavour;
		this.size=size;
	}
	
	public void display()
	{
		System.out.println("Chocolate brand:"+this.brand);
		System.out.println("Chocolate price:"+this.price);
		System.out.println("Chocolate flavour:"+this.flavour);
		System.out.println("Chocolate size:"+this.size);
		System.out.println("=====");
	}
}