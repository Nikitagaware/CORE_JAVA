//Default constructor.....
//create a class emp/Default1(eno,ename,sal)initialised data members using default constructor & display.


public class Default1
{
	int eno;
	String ename;
	float sal;
	Default1()
	{
		eno=10;
		ename="Nikita";
		sal=579584;
	}
	void disp()
	{
		System.out.println("emp no="+eno);
		System.out.println("emp name="+ename);
		System.out.println("sal="+sal);
	}
	public static void main(String[] args)
	{
		Default1 ob=new Default1();
		ob.disp();
	}
}
/*----------------output-------------
emp no=10
emp name=Nikita
sal=579584.0
*/