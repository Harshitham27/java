class PaperRunner
{
	public static void main(String[] args)
	{
		Paper paper=new Paper("A4");
		paper.setPaper("Brighter","White");
		paper.display();
		
		Paper paper1=new Paper("A3");
		paper1.setPaper("Better","White");
		paper1.display();
		
		Paper paper2=new Paper("A2");
		paper2.setPaper("Good","White");
		paper2.display();
	}
}