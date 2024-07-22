class Hospital
{
	public static double price(String medicineName)
	{
		System.out.println("Running price in Hospital");
		System.out.println("Medicine Name:"+medicineName);
		if (medicineName=="Dolo650")
		{
			double price1=10;
			return price1;
		}
		else if (medicineName=="Paracetamol")
		{
			double price2=50;
			return price2;
		}
		else if (medicineName=="Dopamine")
		{
			double price3=100;
			return price3;
		}
		return 0;
	}
	public static String medicineName(String symptom)
	{
		System.out.println("Running medicineName in Hospital");
		System.out.println("Symptom:"+symptom);
		if (symptom=="Headache")
		{
			String name1="Ibuprofen";
			return name1;
		}
		else if (symptom=="Fever")
		{
			String name2="Dolo650";
			return name2;
		}
		else if (symptom=="Cold")
		{
			String name3="Pseudoephedrine";
			return name3;
		}
		return "Not found";
}
    public static boolean availability(String doctorName)
	{
		System.out.println("Running availability in Hospital");
		System.out.println("Doctor name:"+doctorName);
		if (doctorName=="Lakshmish")
		{
			boolean available1=false;
			return available1;
		}
		else if (doctorName=="Jayashree")
		{
			boolean available2=false;
			return available2;
		}
		else if (doctorName=="Jeevitha")
		{
			boolean available3=true;
			return available3;
		}
		return false;
}
}