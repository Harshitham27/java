class Party
{
	public static void political(String[] parties)
	{
		System.out.println("Start political in Party");
		for(int num=0;num<parties.length;num++)
		{
			String ref=parties[num];
			System.out.println("Political parties:"+ref);
		}
		System.out.println("End political in Party");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Running main in Party");
		String[] party={"BJP","INC","BSP","CPI","NCP"};
		political(party);
	}
}