//write java program to count number of digit,spaces & characters from a file.  
import java.io.*;
class Demo3 
{
	public static void main(String[] args) 
	{
	   try
	   {
		   FileInputStream f1=new FileInputStream("abc.txt");
		   int k,d=0,c=0,sp=0,sy=0,li=0;
		   while((k=f1.read())!=-1)
		   {
			   if(Character.isLetter(k))
				   c++;
			   else if(k>='0' && k<='9')
				   d++;
			   else if(k==' ')
				   sp++;
			   else if(k=='\n')
				   li++;
			   else
				   sy++;
		   }
		   System.out.println("Character count="+c);
		   System.out.println("Digit count="+d);
		   System.out.println("Space count="+sp);
		   System.out.println("Symbol count="+sy);
		   System.out.println("Line count="+li);
		   f1.close();
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
		   
		}
	   }
	}
/*----------output-------------
 * Character count=26
Digit count=1
Space count=5
Symbol count=12
Line count=3
*/

/*------file(abc.txt)----------
 * Hii...2
Good Morning ...
Have a nice Day!!!
*/
