class CapitalCity
{
	String name;
	int population;
	
	public CapitalCity(String name,int population)
	{
		this.name=name;
		this.population=population;
	}
	
	public void display()
	{
		System.out.println("CapitalCity name:"+name);
		System.out.println("CapitalCity population:"+population);
	}
}