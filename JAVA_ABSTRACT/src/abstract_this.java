//abstract class
/*create class shape with methods calc_area() & calc_volume().drive two classes
 *sphere(radius)& Cone(radius,height) from it.Calculate  area & volume 
 *of both (use method Overriding)
 * 
 */
abstract class shape1
{
	abstract void calc_area();
	abstract void calc_volume();
}
class sphere extends shape1
{
	float r;
	sphere(float r)
	{
		this.r=r;
		
	}
	void calc_area()
	{
		float a=4*3.14f*r*r;
		System.out.println("Area of sphere="+a);
	}
	void calc_volume()
	{
		float a=4/3*3.14f*r*r*r;
		System.out.println("Volume of sphere="+a);
	}
}
class cone extends shape1
{
	float r,h;
	cone(float r,float h)
	{
		this.r=r;
		this.h=h;
	}
	void calc_area()
	{
		double a=3.14f*r*(r+Math.sqrt(h*h)+Math.sqrt(r*r));
		System.out.println("Area of cone="+a);
	}
	void calc_volume()
	{
		float a=0.5f*h*3.14f*r*r;
		System.out.println("Volume of cone ="+a);
	}
}
public class abstract_this 
{
	public static void main(String[] args)
	{
	   sphere ob=new sphere(6.7f);
	   cone ob1=new cone(4.6f,8.3f);
	   ob.calc_area();
	   ob.calc_volume();
	   ob1.calc_area();
	   ob1.calc_volume();

	}
}
/*--------output-----------------
Area of sphere=563.81836
Volume of sphere=944.39575
Area of cone=252.77000212433134
Volume of cone =275.73596
*/