class RocketRunner
{
	public static void main(String[] args)
	{
		Rocket rocket=new Rocket("India");
		rocket.setRocket(2500,1000);
		rocket.display();
		
		Rocket rocket1=new Rocket("China");
		rocket1.setRocket(25000,10000);
		rocket1.display();
		
		Rocket rocket2=new Rocket("Japan");
		rocket2.setRocket(1500,2000);
		rocket2.display();
	}
}