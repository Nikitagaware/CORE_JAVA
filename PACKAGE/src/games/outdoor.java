package games;
public class outdoor 
{
	String gname;
	int players;
	public outdoor(String gname,int players)
	{
		this.gname=gname;
		this.players=players;
		
	}
	public void disp()
	{
		System.out.println("Outdoor Game Name="+gname);
		System.out.println("no of Players="+players);
	}
  protected void finalized()
  {
	  System.gc();
  }
}
