class Prime
{
	public static void minister(String[] ministers)
	{
		System.out.println("Start minister in Prime");
		for(int name=0;name<ministers.length;name++)
		{
			String ref=ministers[name];
			System.out.println("Minister:"+ref);
		}
		System.out.println("End minister in Prime");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Running main in Prime");
		String[] names={"Pandit Jawaharlal Nehru","Lal Bahadur Shastri","Gulzarilal Nanda","Indira Gandhi","Moraji Desai","Charan singh","Rajiv Gandhi","Vishwa pratap singh",
		"ChandraShekar","P V Narasimha rao","Atal Bihari Vajpayee","H D Devegowda","Inder kumar Gujral","Dr Manmohan Singh","Narendra Modi"};
		minister(names);
	}
}