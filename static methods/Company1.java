class Company1
{
	public static double salary(int age, char gender)
	{
		System.out.println("Running salary in Company1");
		double salary=15000;
		double emi=3000;
		double healthInsurance=3000;
		if (age>18 && age<25)
		{
			return salary;
		}
		if (age>25 && age<30)
		{
			if(gender=='M')
			{
				double salary1= salary+2000-emi;
			    return salary1;
			}
			else if (gender=='F')
			{
				double salary3= salary+2000-healthInsurance;
			    return salary3;
			}
		}
		else if (age>30)
		{
			double salary2= salary+4000;
			return salary2;
		}
		return 0;
	}
}