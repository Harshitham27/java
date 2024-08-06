class Projector
{
	String company;
	String type="LED projector";
	String color;
	double weight;
	
	public Projector(double weight)
	{
		this.weight=weight;
	}
	
	public void setProjector(String company,String color)
	{
		this.company=company;
		this.color=color;
	}
	
	public void display()
	{
		System.out.println("Projector company:"+this.company);
		System.out.println("Projector type:"+this.type);
		System.out.println("Projector color:"+this.color);
		System.out.println("Projector weight:"+this.weight);
		System.out.println("=====");
	}
}