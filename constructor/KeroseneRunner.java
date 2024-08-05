class KeroseneRunner
{
	public static void main(String[] args)
	{
		Kerosene kerosene=new Kerosene();
		System.out.println("Price:"+kerosene.price);
		System.out.println("Quantity:"+kerosene.quantity);
		System.out.println("Quality:"+kerosene.quality);
		
		Kerosene kerosene1=new Kerosene(100,2,false);
		System.out.println("Price:"+kerosene1.price);
		System.out.println("Quantity:"+kerosene1.quantity);
		System.out.println("Quality:"+kerosene1.quality);
		
		Kerosene kerosene2=new Kerosene(true);
		System.out.println("Price:"+kerosene2.price);
		System.out.println("Quantity:"+kerosene2.quantity);
		System.out.println("Quality:"+kerosene2.quality);
		
		Kerosene kerosene3=new Kerosene(200);
		System.out.println("Price:"+kerosene3.price);
		System.out.println("Quantity:"+kerosene3.quantity);
		System.out.println("Quality:"+kerosene3.quality);
	}
}