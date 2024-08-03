//String program
//Accept String & display greater String
import java.util.*;
public class String_greater 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter String 1:");
	  String s1=sc.nextLine();
	  System.out.println("enter String 2:");
	  String s2=sc.nextLine();
	   int k=s1.compareTo(s2);
	  if(k==0)
	    System.out.println("String are Same:");
	  if(k>0)
		  System.out.println("String1 are greater");
	  if(k<0)
		  System.out.println("String2 are greater");
	}

}
/*=================output
enter String 1:
shrirampur
enter String 2:
nikita
String1 are greater
*/