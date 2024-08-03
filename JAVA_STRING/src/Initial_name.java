//String program
 //Accept first name,middle &last name & display last name with initials

import java.util.*;
public class Initial_name
{
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Full name:");
	  String s1=sc.nextLine();
	  String s2[]=s1.split(" ");
	  System.out.println("Name="+s2[2]+" "+s2[0].charAt(0)+"."+s2[1].charAt(0)+".");
	}
}
/*-------------output------------
Enter Full name:
Nikita Gopinath Gaware
Name=Gaware N.G.
*/