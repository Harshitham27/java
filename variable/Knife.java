class Knife
{
	double weight;
	double height;
	
	public Knife(double weight,double height)
	{
		this.weight=weight;
		this.height=height;
	}
	
	public void show()
	{
		System.out.println("Knife weight:"+weight);
		System.out.println("Knife height:"+height);
	}
}