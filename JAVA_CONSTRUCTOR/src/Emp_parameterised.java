/*parameterised constructor
 * create class emp(eno,ename,sal)initialised data members uusing parameterised
 *  constructor and display
 */

import java.util.*;
public class Emp_parameterised
{
	int eno;
	String ename;
	float sal;
	Emp_parameterised(int eno ,String ename,float sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
   void disp()
   {
	   System.out.println("Emp no="+eno);
	   System.out.println("Emp name="+ename);
	   System.out.println("Emp sal="+sal);
   }
	public static void main(String[] args)
	{
		Emp_parameterised ob=new Emp_parameterised(101,"Nikita",4367.00f);
		ob.disp();
	}
}
/*------output---------
Emp no=101
Emp name=Nikita
Emp sal=4367.0
*/