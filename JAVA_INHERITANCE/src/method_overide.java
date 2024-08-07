//method overiding 
class A4
{
	void add(int x,int y)
	{
		System.out.println( "Addition 1="+(x+y));
	}
}
class B3 extends A4
{
	void add(int x,int y)
	{
		super.add(x, y);
		System.out.println("Addition 2="+(x+y));
	}
}
public class method_overide 
{
	public static void main(String[] args)
	{
	     B3 ob=new B3();
	     ob.add(11, 22);
	}

}
/*Addition 1=33
Addition 2=33
*/