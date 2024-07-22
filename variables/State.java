class State
{
	public static void regions(String[] states)
	{
		System.out.println("Start region in State");
		for(int no=0;no<states.length;no++)
		{
			String ref=states[no];
			System.out.println("States:"+ref);
		}
		System.out.println("End region in State");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Running main in State");
		String[] stateName={"Andra pradesh","Arunchal pradesh","Assam","Bihar","Chattisgarh","Goa","Gujarat","Haryana","Himachal pradesh","Jharkand","Karnataka","Kerala","Madhya pradesh",
		"Maharashtra","Manipur","Meghalya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil nadu","Telangana","Tripura","Uttar pradesh","Uttarkhand","West bengal"};
	    regions(stateName);
	}
}