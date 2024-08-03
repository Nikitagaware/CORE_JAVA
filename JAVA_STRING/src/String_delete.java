//StringBuffer program..
//delete,insert,set character specified position(setCharAt())
import java.util.*;
public class String_delete 
{
	public static void main(String[] args)
	{
	   String s1="Shrirampur";
	   StringBuffer sbr=new StringBuffer(s1);
	 //sbr.delete(3,5); 
	    //sbr.deleteCharAt(5);
	   //sbr.insert(3, "abc");
	   sbr.setCharAt(4, 'D');
	  // System.out.println("Delete String ="+sbr);
	   //System.out.println("insert String ="+sbr);
	   System.out.println("setCharacter  ="+sbr);

	}

}
/*---------output---------------
Delete String =Shrampur
Delete String =Shrirmpur
insert String =Shrabcirampur
setCharacter  =ShriDampur
*/