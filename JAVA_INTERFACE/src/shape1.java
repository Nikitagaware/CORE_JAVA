//Interface
/*Define an interface shape with abstract method area() write a java program
 *to calculate an area of circle & sphere(use final keyword)
 * 
 */
interface shape
{
	final float PI=3.14f;
	void areac(float r);
	void areas(float r);
	
}
class Demo implements shape
{
	public void areac(float r)
	{
		float a=PI*r*r;
		System.out.println("Area of circle="+a);
	}
	public void areas(float r)
	{
		float a=4*PI*r*r;
		System.out.println("area of sphere="+a);
	}
}
public class shape1 
{
	public static void main(String[] args) 
	{
	   Demo ob=new Demo();
	   ob.areac(3.5f);
	   ob.areas(3.5f);
	}
}
/*-----------output-----
 * Area of circle=38.465004
area of sphere=153.86002
*/



