class Key
{
	double weight;
	String brand;
	
	public Key(double weight,String brand)
	{
		this.weight=weight;
		this.brand=brand;
	}
	
	public void display()
	{
		System.out.println("Key weight:"+weight);
		System.out.println("Key brand:"+brand);
	}
}