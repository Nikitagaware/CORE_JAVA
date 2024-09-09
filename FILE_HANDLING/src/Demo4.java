//copy file...
import java.io.*;
class Demo4
{
	public static void main(String[] args) 
	{
	    try
	    {
	    	FileInputStream f1=new FileInputStream("abc.txt");
	    	FileOutputStream f2=new FileOutputStream("xyz.txt");
	    	int k;
	    	while((k=f1.read())!=-1)   //-1 means EOF
	    	{
	    		f2.write(k);
	    	}
	    	f1.close();
	    	f2.close();
	    	System.out.println("File copy Success....");
	    }catch(Exception e)
	    {
	    	System.out.println(e);
	    }

	}

}
/*output--File copy Success....
-----------output file (xyz.txt)----------
Hii...2
Good Morning ...
Have a nice Day!!!
---------------abc.txt----

Hii...2
Good Morning ...
Have a nice Day!!!
*/
