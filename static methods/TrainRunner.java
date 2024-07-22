class TrainRunner
{
	public static void main(String[] args)
	{
		Train.book("Nelamangala","Bangalore");
		Train.book("Bangalore","Mysore",2);
		Train.book("Nelamangala","Bangalore",5,120.2);
		Train.cancel("HJ2427");
		Train.cancel("Hassan","Mysore");
	}
}