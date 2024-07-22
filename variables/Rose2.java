class Rose2
{
	public static void main(String[] palaceInfos)
	{
		System.out.println("Running main in Rose2");
		if(palaceInfos.length==4)
		{
			String name=palaceInfos[0];
			String location=palaceInfos[1];
			String builtBy=palaceInfos[2];
			String buildYear=palaceInfos[3];
	        System.out.println("Name:"+name);
			System.out.println("Location:"+location);
			System.out.println("Built by:"+builtBy);
			System.out.println("Build year:"+buildYear);
		}
		else{
			System.out.println("Max 4 references required");
		}
	}
}