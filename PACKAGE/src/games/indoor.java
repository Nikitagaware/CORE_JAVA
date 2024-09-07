package games;
public class indoor
{
	String gname;
	int players;
	public indoor(String game,int players)
	{
		this.gname=gname;
		this.players=players;
	}
	public void disp()
	{
		System.out.println("Indoor game Name="+gname);
		System.out.println("No of players="+players);
	}
	protected void finalized()
	{
		System.gc();
	}
}
