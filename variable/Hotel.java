class Hotel
{
	String name="Swathi";
	Owner owner=new Owner("Harsh",22,'F');
	
	public Hotel()
	{
		
	}
	
	public void present()
	{
		System.out.println("Hotel name:"+name);
		owner.present();
	}
}