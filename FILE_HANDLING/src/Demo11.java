//List method()
//display java extension files in the given directory
import java.io.*;
class Demo11 
{
	public static void main(String[] args) 
	{
	   File f1=new File("d:\\ty");
	   if(f1.exists())
	   {
		   if(f1.isDirectory())
		   {
			   String s1[]=f1.list();
			   for(int i=0;i<s1.length;i++)
			   {
				   if(s1[i].endsWith(".java"))
					   System.out.println(s1[i]);
			   }
		   }
	   }
	   else
	   {
		   System.out.println("File folder not found");
	   }

	}

}
//output--emp.java
