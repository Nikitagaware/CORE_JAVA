//Inheritance
//1}Single Inheritance example
/*create a base class student(rno,name,per,EmailId) create a derived class 
 *emp(eno,designation,salary).accept student & emp info from users & display.
 * 
 */
import java.util.*;
   class student1
{
    int rno;
    String name,email;
    float per;
    Scanner sc=new Scanner(System.in);
    void accepts()
    {
    	System.out.println("Enter Roll no:");
    	rno=sc.nextInt();
    	System.out.println("Enter Name:");
    	name=sc.next();
    	System.out.println("Enter per:");
    	per=sc.nextFloat();
    	System.out.println("Enter Email:");
    	email=sc.next();
    }
}
 class emp extends student1
 {
	  int eno;
	  String desig;
	  float sal;
	  void accepte()
	  {
		  System.out.println("Enter Emp no:");
		  eno=sc.nextInt();
		  System.out.println("Enter Desgnation:");
		  desig=sc.next();
		  System.out.println("Enter salary:");
		  sal=sc.nextFloat();
	  }
	  void disp()
	  {
		  System.out.println("emp no="+eno);
		  System.out.println("emp name="+name);
		  System.out.println("emp designation="+desig);
		  System.out.println("emp salary="+sal);
		  System.out.println("emp Id="+email); 
	  }
 }
	  public class student
	  {
	public static void main(String[] args) 
	{
	   emp ob=new emp();
	   ob.accepts();
	   ob.accepte();
	   ob.disp();
	}
	  }
/*--------------output---------
	  Enter Roll no:
	  101
	  Enter Name:
	  nikita
	  Enter per:
	  66.00
	  Enter Email:
	  nikita123@gmail.com
	  Enter Emp no:
	  101
	  Enter Desgnation:
	  teacher
	  Enter salary:
	  135566
	  emp no=101
	  emp name=nikita
	  emp designation=teacher
	  emp salary=135566.0
	  emp Id=nikita123@gmail.com
*/