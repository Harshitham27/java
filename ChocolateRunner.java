class ChocolateRunner
{
	public static void main(String[] args)
	{
	Chocolate chocolate=new Chocolate(180);
	chocolate.setChocolate("Chocolate","Small");
	chocolate.display();
	
	Chocolate chocolate1=new Chocolate(70);
	chocolate1.setChocolate("Strawberry","medium");
	chocolate1.display();
	
	Chocolate chocolate2=new Chocolate(280);
	chocolate2.setChocolate("Caramel","Large");
	chocolate2.display();
	}
}