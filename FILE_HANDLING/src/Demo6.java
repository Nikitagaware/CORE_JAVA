/*write a java program to copy the data from one file into another file 
 * while copying change the case of character in target file & replaces 
 * all digits by '*' symbol(using characterStream)
 */
import java.io.*;
class Demo6 
{
	public static void main(String[] args)
	{
		try
		{
	    FileReader f1=new FileReader("abc.txt");
	    FileWriter f2=new FileWriter("abc1.txt");
	    int k;
	    while((k=f1.read())!=-1)
	    {
	    	if(Character.isUpperCase(k))
	    		f2.write(Character.toLowerCase(k));
	    	else if(Character.isLowerCase(k))
	    		f2.write(Character.toUpperCase(k));
	    	else if(Character.isDigit(k))
	    		f2.write('*');
	    	else
	    		f2.write(k);
	    }
	    f1.close();
		f2.close();
		System.out.println("file Copy Succ...");
		}catch(Exception e)
		{
			System.out.println(e);
	    }
	}

}
/*-------------output--------------
file Copy Succ...
-------------------file=abc.txt----------
Hii...2
Good Morning ...
Have a nice Day!!!
------------------file=abc1.txt--------
hII...*
gOOD mORNING ...
hAVE A NICE dAY!!!
*/