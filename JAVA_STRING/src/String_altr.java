//String program
//Accept String & display alternate from the String
import java.util.*;
public class String_altr 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
    String s1=sc.nextLine();
    System.out.println("Alternate char=");
    for(int i=0;i<s1.length();i=i+2)
    {
    	System.out.println(s1.charAt(i));
    }
	}

}
/*============output=========================
Enter String:
shrirampur
Alternate char=
s
r
r
m
u
*/