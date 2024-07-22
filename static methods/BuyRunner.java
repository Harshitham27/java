class BuyRunner
{
	public static void main(String[] values)
	{
		Buy.product("Dell",400);
		Buy.product("Dell",-200);
		
		Buy.product("Sunscreen",150,"Best",600.0);
		Buy.product("Sunscreen",150,"Best",600.0);
		
		Buy.bookMovieTicket("Loveli","Inox",2,400.0);
		Buy.bookMovieTicket("Loveli","Inox",2,-400.0);
		
		Buy.buyEgg(4,7.0);
		Buy.buyEgg(-4,-7.0);
		
		Buy.buyShampoo(5,10.0,"Chik","02-06-2024");
		Buy.buyShampoo(5,-10.0,"Chik","02-06-2024");
		
		Buy.buyCake('R',"Cupcake","Chocolate",120.0,2);
		Buy.buyCake('R',"Cupcake","Chocolate",-120.0,2);
		
		Buy.buyLaptop("Lenovo",12345,58000.0,48000,13.3,"Windpws10",256,8);
		Buy.buyLaptop("Lenovo",-12345,58000.0,48000,13.3,"Windpws10",256,8);
		
		Buy.buySmartWatch("Fasttrack",5900.0,1,'D',1);
		Buy.buySmartWatch("Fasttrack",-5900.0,2,'D',1);
	}
}


 