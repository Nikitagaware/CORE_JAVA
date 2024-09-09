//display file
import java.io.*;
class Demo2
{
 	public static void main(String[] args)
 	{
	    try
	    {
	    	FileInputStream f1=new FileInputStream("abc.txt");
	    	int k;
	    	while((k=f1.read())!=-1)    //-1 means EOF
	    	{
	    		System.out.print((char)k);
	    	}
	    	f1.close();
	    	
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
 	}

}
/*--output------------
Hii...
Good Morning ...
Have a nice Day!!!
*/