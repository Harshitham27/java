class ShopRunner
{
	public static void main(String[] args)
	{
		String country=Shop.country(91);
		System.out.println("Country:"+country);
		String country1=Shop.country(86);
		System.out.println("Country:"+country1);
		String country2=Shop.country(852);
		System.out.println("Country:"+country2);
		String country3=Shop.country(81);
		System.out.println("Country:"+country3);
		String country4=Shop.country(92);
		System.out.println("Country:"+country4);
		String country5=Shop.country(94);
		System.out.println("Country:"+country5);
		
		double cost=Shop.price("Laptop");
		System.out.println("Cost:"+cost);
		double cost1=Shop.price("phone");
		System.out.println("Cost:"+cost1);
		double cost2=Shop.price("bottle");
		System.out.println("Cost:"+cost2);
		double cost3=Shop.price("remote");
		System.out.println("Cost:"+cost3);
		double cost4=Shop.price("cream");
		System.out.println("Cost:"+cost4);
		double cost5=Shop.price("pen");
		System.out.println("Cost:"+cost5);
		
		String film=Shop.movie("Kalki");
		System.out.println("Film:"+film);
		String film1=Shop.movie("KGF");
		System.out.println("Film:"+film1);
		String film2=Shop.movie("Kaatera");
		System.out.println("Film:"+film2);
		String film3=Shop.movie("Kotee");
		System.out.println("Film:"+film3);
		String film4=Shop.movie("Indian2");
		System.out.println("Film:"+film4);
		String film5=Shop.movie("Love");
		System.out.println("Film:"+film5);
	}
}