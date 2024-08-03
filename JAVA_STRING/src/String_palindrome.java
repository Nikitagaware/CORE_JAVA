//Write java program to check whether given String is palindrome or not

import java.util.*;
public class String_palindrome
{
   public static void main(String[] args) 
   {
	 String str="Radar";
	 String rev="";
	 int length=str.length();
	 for(int i=length-1;i>=0;i--)
		 rev=rev+str.charAt(i);
	 if(str.equals(rev))
		 System.out.println(str+"is a palindrome");
	 else
		 System.out.println(str+"is a not palindrome");
	}

}
/*===output======
 * Radaris a not palindrome
*/
