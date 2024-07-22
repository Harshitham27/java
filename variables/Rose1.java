class Rose1
{
	public static void main(String[] forestInfos)
	{
		System.out.println("Running main in Rose1");
		if(forestInfos.length==4)
		{
			String name=forestInfos[0];
			String area=forestInfos[1];
			String esrablishedYear=forestInfos[2];
			String state=forestInfos[3];
	        System.out.println("Name:"+name);
			System.out.println("Area:"+area);
			System.out.println("Established year:"+esrablishedYear);
			System.out.println("State:"+state);
		}
		else{
			System.out.println("Max 4 references required");
		}
	}
}