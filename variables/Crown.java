class Crown
{
	public static void regions(String[] states)
	{
		System.out.println("Start region in State");
		for(int no=states.length-1;no>=0;no--)
		{
			String ref=states[no];
			System.out.println("States:"+ref);
		}
		System.out.println("End region in State");
	}
	
		public static void pinCode(int[] pincodes)
	{
		System.out.println("Start pincode in Code");
		for(int num=pincodes.length-1;num>0;num--)
		{
			int ref=pincodes[num];
			System.out.println("Pincode:"+ref);
		}
		System.out.println("End pincode in Code");
	}
	
	public static void minister(String[] ministers)
	{
		System.out.println("Start minister in Prime");
		for(int name=ministers.length-1;name>=0;name--)
		{
			String ref=ministers[name];
			System.out.println("Minister:"+ref);
		}
		System.out.println("End minister in Prime");
	}
	
	public static void cabinet(String[] ministers)
	{
		System.out.println("Start minister in Cabinet");
		for(int no=ministers.length-1;no>=0;no--)
		{
			String ref=ministers[no];
			System.out.println("Cabinet Minister:"+ref);
		}
		System.out.println("End minister in Cabinet");
	}
	
	public static void political(String[] parties)
	{
		System.out.println("Start political in Party");
		for(int num=parties.length-1;num>=0;num--)
		{
			String ref=parties[num];
			System.out.println("Political parties:"+ref);
		}
		System.out.println("End political in Party");
	}
}
