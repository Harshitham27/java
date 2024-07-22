class Company1Runner
{
	public static void main(String[] args)
	{
		System.out.println("Runnin main in Company1Runner");
		double income1=Company1.salary(21,'F');
		System.out.println("Salary:"+income1);
		double income2=Company1.salary(27,'M');
		System.out.println("Salary:"+income2);
		double income4=Company1.salary(28, 'M');
		System.out.println("Salary:"+income4);
		double income5=Company1.salary(27, 'F');
		System.out.println("Salary:"+income5);
		double income3=Company1.salary(35,'M');
		System.out.println("Salary:"+income3);
	}
}
		