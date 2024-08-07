class HashishRunner
{
	public static void main(String[] args)
	{
		Knife knife=new Knife(20,10.2);
		knife.show();
		Hashish hashish=new Hashish("Vivo",knife);
		hashish.show();
		
		Knife knife1=new Knife(15,5.5);
		knife1.show();
		Hashish hashish1=new Hashish("Oppo",knife);
		hashish1.show();
	}
}