class BloodRunner
{
	public static void main(String[] groups)
	{
		System.out.println("Running main in BloodRunner");
		String category=Blood.group();
		System.out.println("Blood group:"+category);
		
		String name=Blood.personName();
		System.out.println("Name:"+name);
		
		double price=Blood.cost();
		System.out.println("Price:"+price);
		
		boolean tested=Blood.hospitalTested();
		System.out.println("Hosptial tetsed:"+tested);
		
		boolean sickness=Blood.sickness();
		System.out.println("Sickness or not:"+sickness);
		
		boolean donate=Blood.donate();
		System.out.println("Donate or not:"+donate);
	}
}