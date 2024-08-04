//constructor
/*create an employee class(id,name,deptname,salary). define a default &parameterised
 *constructor use this keyword to initialize instance variables,keep
 * a count of objects created.create objects using parameterized constructor & display the object
 * count after each object is created(use static member & method).Also display the
 *  contents of each object..  
 */
import java.util.*;
public class employee
{
	static int cnt;
	int eno;
	String ename,dname;
	float sal;
	employee()
	{
		eno=11;
		ename="Nikita";
		sal=45676;
		dname="sales";
	}
	employee(int eno,String ename,float sal,String dname)
	{
		cnt++;
		System.out.println("Object count="+cnt);
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		this.dname=dname;
	}
	void disp()
	{
		System.out.println("Emp no="+eno);
		System.out.println("Emp name="+ename);
		System.out.println("emp sal="+sal);
		System.out.println("dept name="+dname);
	}
	public static void main(String[] args)
	{
	   employee ob=new employee(1,"yogita",50000,"computer");
	   employee ob1=new employee(2,"Mitali",45000,"account");
	   employee ob2=new employee(3,"Harshada",34000,"computer");
	   ob.disp();
	   ob1.disp();
	   ob2.disp();

	}

}
/*---------------output---------------
 * Object count=1
Object count=2
Object count=3
Emp no=1
Emp name=yogita
emp sal=50000.0
dept name=computer
Emp no=2
Emp name=Mitali
emp sal=45000.0
dept name=account
Emp no=3
Emp name=Harshada
emp sal=34000.0
dept name=computer
*/
