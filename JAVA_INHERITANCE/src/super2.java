//super Keyword
//third use:Calling Base class Methods

class A3
{
	void add(int x,int y)
	{
		System.out.println("Addition1="+(x+y));
	}
}
class B2 extends A3
{
	void add(int x,int y)
	{
		System.out.println("Addition2="+(x+y));
		super.add(x, y);
	}
}
public class super2 
{
  public static void main(String arg[])
  {
	  B2 ob=new B2();
	  ob.add(11, 22);
  }
}

 /*------------output-------
Addition2=33
Addition1=33
*/