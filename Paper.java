class Paper
{
	double thickness=0.10;
	String size;
	String quality;
	String color;
	
	public Paper(String size)
	{
		this.size=size;
	}
	
	public void setPaper(String quality,String color)
	{
		this.quality=quality;
		this.color=color;
	}
	
	public void display()
	{
		System.out.println("Paper thickness:"+this.thickness);
		System.out.println("Paper size:"+this.size);
		System.out.println("Paper quality:"+this.quality);
		System.out.println("Paper color:"+this.color);
		System.out.println("=====");
	}
}