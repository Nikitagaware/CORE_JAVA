//StringBuffer program...
//Accept String & display reverse order........

import java.util.*;
public class String_Buffer_reverse
{
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter String :");
	   String s1=sc.next();
	   StringBuffer sbr=new StringBuffer(s1);
	   sbr.reverse();
	   System.out.println("Reverse String="+sbr);

	}

}
/*===========output==================
Enter String :
Nikita
Reverse String=atikiN
*/