class Rose
{
	public static void main(String[] personInfos)
	{
		System.out.println("Running main in Rose");
		if(personInfos.length==4)
		{
			String name=personInfos[0];
			String email=personInfos[1];
			String age=personInfos[2];
			String password=personInfos[3];
	        System.out.println("Name:"+name);
			System.out.println("Email:"+email);
			System.out.println("Age:"+age);
			System.out.println("Password:"+password);
		}
		else{
			System.out.println("Max 4 references required");
		}
	}
}