class Speaker
{
	String brand="Sony";
	String size;
	double cost;
	String output;
	
	public Speaker(double cost)
	{
		this.cost=cost;
	}
	
	public void setSpeaker(String size,String output)
	{
		this.size=size;
		this.output=output;
	}
	
	public void display()
	{
		System.out.println("Speaker brand:"+this.brand);
		System.out.println("Speaker size:"+this.size);
		System.out.println("Speaker cost:"+this.cost);
		System.out.println("Speaker output:"+this.output);
		System.out.println("=====");
	}
}