//String program
//replace(),replaceAll()...........
import java.util.*;
public class String_replace
{
	public static void main(String[] args)
	{
	   String s1="India is my country I Love my India";
	   //s1=s1.replace("India","Bharat");
	   s1=s1.replaceAll("India", "Bharat");
	   System.out.println(s1);

	}

}
/*===========output==================
  Bharat is my country I Love my Bharat
  Bharat is my country I Love my Bharat
 * */

