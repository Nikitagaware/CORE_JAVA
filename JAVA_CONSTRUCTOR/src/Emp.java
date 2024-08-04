//Default constructor
//create a class Emp(eno,ename,sal)Accept employee information from user in default constructor & display..

import java.util.*;
public class Emp 
{
   int eno;
   String ename;
   float sal;
   Emp()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter eno ename sal:");
	    eno=sc.nextInt();
	    ename=sc.next();
	    sal=sc.nextFloat();
   }
   void disp()
   {
	   System.out.println("emp no="+eno);
	   System.out.println("emp name="+ename);
	   System.out.println("emp sal="+sal);
   }
	public static void main(String[] args)
	{
	   Emp ob=new Emp();
	   ob.disp();
	}
}
/*------------output------------
Enter eno ename sal:
101
Nikita
4000
emp no=101
emp name=Nikita
emp sal=4000.0
*/