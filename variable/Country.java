class Country
{
	String name;
	String continent;
	State state=new State("Karnataka","Kannada");
	
	public Country(String name,String continent)
	{
		this.name=name;
		this.continent=continent;
	}

	public void display()
	{
		System.out.println("Country name:"+name);
		System.out.println("Country continent:"+continent);
		state.display();
	}
}