//Reverse number......
public class reverse
{
	public static void main(String[] args)
	{
	    int n=345;
	    int d,s=0;
	    while(n>0)
	    {
	    	d=n%10;
	    	s=s*10+d;
	    	n=n/10;
	    }
	    System.out.println("Reverse no="+s);

	}

}
/*=============================output==========
 Reverse no=543
*/


