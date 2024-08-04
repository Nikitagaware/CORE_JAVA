/*parameterised constructor
 * Accpet a emp info. from user & pass to the  parameterised constructor & display.
 */
import java.util.*;
public class paramet_emp
{
   int eno;
   String ename;
   float sal;
   paramet_emp(int eno,String ename,float sal)
   {
	   this.eno=eno;
	   this.ename=ename;
	   this.sal=sal;
   }
   void disp()
   {
	   System.out.println("Empno="+eno);
	   System.out.println("Emp name="+ename);
	   System.out.println("Emp sal="+sal);
   }
   public static void main(String arg[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter eno ename sal:");
	   int eno=sc.nextInt();
	   String ename=sc.next();
	    Float sal=sc.nextFloat();
	    paramet_emp ob=new   paramet_emp(eno,ename,sal);
	    ob.disp();
   }
}
/*----------output-------------
 * enter eno ename sal:
11
nikita
45600
Empno=11
Emp name=nikita
Emp sal=45600.0
*/
