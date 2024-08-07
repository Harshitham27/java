class KeybunchRunner
{
	public static void main(String[] args)
	{
		Key key=new Key(5,"Yale");
		key.display();
		Keybunch keybunch=new Keybunch("Metal",key);
		keybunch.display();
		
		
	    Key key1=new Key(10,"Stanley");
		key1.display();
		Keybunch keybunch1=new Keybunch("Steel",key);
		keybunch1.display();
	}
}