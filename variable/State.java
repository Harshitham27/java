class State
{
	String name;
	String language;
	CapitalCity capitalcity=new CapitalCity("Bangalore",500000);
	
	public State(String name,String language)
	{
		this.name=name;
		this.language=language;
	}

	public void display()
	{
		System.out.println("State name:"+name);
		System.out.println("State language:"+language);
		capitalcity.display();
	}
}