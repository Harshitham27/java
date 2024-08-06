class SpeakerRunner
{
	public static void main(String[] args)
	{
		Speaker speaker=new Speaker(1500);
		speaker.setSpeaker("medium","50w");
		speaker.display();
		
		Speaker speaker1=new Speaker(1000);
		speaker1.setSpeaker("small","150w");
		speaker1.display();
		
		Speaker speaker2=new Speaker(500);
		speaker2.setSpeaker("Large","100w");
		speaker2.display();
	}
}