//Packege example ...DateDemo

import java.util.*;
public class DateDemo 
{
	public static void main(String[] args)
	{
	
	    Date d1=new Date();
	    int dd=d1.getDate();
	    int mm=d1.getMonth()+1;
	    int yy=d1.getYear()+1900;
	    String s=dd+"/"+mm+"/"+yy;
	    System.out.println("Date="+s);
	    System.out.println(d1.getHours()+":"+d1.getMinutes()+":"+d1.getSeconds());
	}

}
/*==========output======
Date=3/9/2024
12:59:37
*/