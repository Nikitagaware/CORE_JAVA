//Abstract
/*create a Abstract class A having abstract  methods add(int,int),square(int)
 *& non abstract method is cube(int).
 *create derived class B & override abstract methods. 
 */
abstract class A
{
	abstract void add(int a,int b);
	abstract void square(int n);
	void cube(int n)
	{
		System.out.println( "Cube="+(n*n*n));
	}
}
class B extends A
{
	void square(int n)
	{
		System.out.println("Square="+(n*n));
	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition="+c);
	}
}
public class abstract_demo 
{
  public static void main(String arg[])
  {
	  B ob=new B();
	  ob.add(11, 22);
	  ob.square(4);
	  ob.cube(5);
  }
}
/*------------output--------------
Addition=33
Square=16
Cube=125
*/