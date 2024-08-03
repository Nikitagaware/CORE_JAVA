//StringBuffer Program
//Write a java program  to display each word in reverse order from a string..

import java.util.*;
public class reverse_word_string 
{
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter String1:");
	   String s1=sc.nextLine();
	   String s2[]=s1.split(" ");    //using split function
	   for(int i=0;i<s2.length;i++)
	   {
		   StringBuffer sbr=new StringBuffer(s2[i]);
		   sbr.reverse();
		   System.out.println(sbr+" ");
	   }
	}
}
/*-----------output------------
Enter String1:
rbnb college shrirampur
bnbr 
egelloc 
rupmarirhs 
*/