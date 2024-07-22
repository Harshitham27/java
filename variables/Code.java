class Code
{
	public static void pinCode(int[] pincodes)
	{
		System.out.println("Start pincode in Code");
		for(int num=1;num<pincodes.length;num++)
		{
			int ref=pincodes[num];
			System.out.println("Pincode:"+ref);
		}
		System.out.println("End pincode in Code");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Running main in Code");
		int[] codes={562123,560001,560002,560003,562125,560005,562130,563160,570075,570078};
		pinCode(codes);
	}
}