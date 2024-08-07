class Owner
{
	String name;
	int age;
	char gender;
	
	public Owner(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void present()
	{
		System.out.println("Owner name:"+name);
		System.out.println("Owner age:"+age);
		System.out.println("Owner gender:"+gender);
	}
}