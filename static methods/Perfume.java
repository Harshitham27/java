class Perfume
{
	public static void fragnance()
	{
		String perfume="Chanel No. 5 is one of the most iconic perfumes in the world.";
		System.out.println("Perfume:"+perfume);
		String bookTitle="To Kill a Mockingbird";
		System.out.println("Book:"+bookTitle);
		boolean login=true;
		System.out.println("Login:"+login);
		boolean paymentSuccess=false;
		System.out.println("Payment success:"+paymentSuccess);
		boolean lightOn=true;
		System.out.println("Light on:"+lightOn);
	}
	
	public static void train()
	{
		double weight=51.5;
		char dollar='$';
		weight=52.1;
		System.out.println("Weight:"+weight);
		System.out.println("Dollar symbol:"+dollar);
	}
	public static void main(String[] args)
	{
		fragnance();
		train();
	}
}