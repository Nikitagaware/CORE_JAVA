//Reverse each word in the file
import java.io.*;
class Demo8 
{
	public static void main(String[] args) 
	{
		try
		{
	   FileReader f1=new FileReader("abc.txt");
	   BufferedReader br=new BufferedReader(f1);
	   String s1;
	   while((s1=br.readLine())!=null)
	   {
		 String s2[]=s1.split(" ");
		 for(int i=0;i<s2.length;i++)
		 {
			 StringBuffer sbr=new StringBuffer(s2[i]);
			 sbr.reverse();
			 System.out.println(sbr+" ");
		 }
		 System.out.println();
	   }
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
/*----------output--------------
2...iiH 

dooG 
gninroM 
... 

evaH 
a 
ecin 
!!!yaD 

--------------file(abc.txt)-----------------
Hii...2
Good Morning ...
Have a nice Day!!!
*/