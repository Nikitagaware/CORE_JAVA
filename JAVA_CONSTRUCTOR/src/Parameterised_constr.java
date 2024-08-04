//Parameterised Constructor......
//basic program

public class Parameterised_constr
{
	Parameterised_constr(int a,int b)   //  parameterised constructor
	{
		int c=a+b;
		System.out.println("Addition="+c);
	}
	public static void main(String arg[])
	{
		Parameterised_constr on=new Parameterised_constr(11,33);
	}
}
/*---------------output-----------------
Addition=44
*/