package TY;
import java.util.*;
public class tymarks 
{
   public  int theory,practical;
   public void accept()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the theory Marks:");
	   theory=sc.nextInt();
	   System.out.println("Enter the parctical Marks");
	   practical=sc.nextInt();
   }
}
