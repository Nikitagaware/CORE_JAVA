//super Keyword
//second use:Calling Base class parameterised constructor
class A2
{
   A2(int x,int y)
   {
	   System.out.println("Addition1="+(x+y));
   }
}
class B1 extends A2
{
	B1(int x,int y)
	{
		super(x,y);
		System.out.println("Additon2="+(x+y));
	}
}
public class super1 {

	public static void main(String[] args)
	{
	  B1 ob=new B1(10,20);	
	}
}
/*------------------output-------------------
Addition1=30
Additon2=30
*/