class Company
{
	int id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("Harsh",1,"Fullstack developer",50000);
	
	public Company(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}

	public void display()
	{
		System.out.println("Company id:"+id);
		System.out.println("Company name:"+name);
		System.out.println("Company location:"+location);
		softwareEngineer.display();
	}
}