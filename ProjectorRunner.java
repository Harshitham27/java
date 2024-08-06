class ProjectorRunner
{
	public static void main(String[] args)
	{
		Projector projector=new Projector(15);
		projector.setProjector("Epson","White");
		projector.display();
		
		Projector projector1=new Projector(10);
		projector1.setProjector("Sony","Black");
		projector1.display();
		
		Projector projector2=new Projector(25);
		projector2.setProjector("Samsung","Blue");
		projector2.display();
	}
}