//Super Keyword
//first use of super :Accessing Base class Members:
 class A1
{
    int x=10;
}
class B extends A1
{
	int x=20;
	void show()
	{
		System.out.println("Value1="+super.x);
		System.out.println("Value2="+x);
		super.x=55;
		System.out.println("value3="+x);
		System.out.println("Value4="+super.x);
	}
}
public class A
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.show();
	}
}
/*--------------output--------------
Value1=10
Value2=20
value3=20
Value4=55
*/