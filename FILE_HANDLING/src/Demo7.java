/*write a java program to display each line from a file in reverse 
 * order
 */
import java.io.*;
class Demo7 
{
	public static void main(String[] args)
	{
		try
		{
	    FileReader f1=new FileReader("abc.txt");
	    BufferedReader br=new  BufferedReader(f1);
	    String s1;
	    while((s1=br.readLine())!=null)
	    {
	    	StringBuffer sbr=new StringBuffer(s1);
	    	sbr.reverse();
	    	System.out.println(sbr);
	    }
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
/*---------output-------------------------
2...iiH
... gninroM dooG
!!!yaD ecin a evaH

---------------file(abc.txt)------------
Hii...2
Good Morning ...
Have a nice Day!!!
*/