//Abstract
/*create abstract class shape with abstract method area() write  a java
 * program to calculate area of rectangle & triangle inherit shape class
 * in classes rectangle  and triangle).
 */
import java.util.*;
abstract class shape
{
	Scanner sc=new Scanner(System.in);
	abstract void area();
}
class Rectangle extends shape
{
	void area()
	{
		System.out.println("Enter length:");
		float l=sc.nextFloat();
		System.out.println("Enter breadth");
		float b=sc.nextFloat();
		float a=l*b;
		System.out.println("Area of Rectangle="+a);
	}
}
class Triangle extends shape
{
	void area()
	{
		System.out.println("Enter base:");
		float b=sc.nextFloat();
		System.out.println("Enter height");
		float h=sc.nextFloat();
		float a=0.5f*b*h;
		System.out.println("Area of Triangle="+a);
	}
}
public class abstract_shape 
{
   public static void main(String arg[])
   {
	   Rectangle ob=new Rectangle();
	   ob.area();
	   Triangle ob1=new Triangle();
	   ob1.area(); 
   }
}
/*-----output----------------
Enter length:
12
Enter breadth
23
Area of Rectangle=276.0
Enter base:
4
Enter height
5
Area of Triangle=10.0
*/