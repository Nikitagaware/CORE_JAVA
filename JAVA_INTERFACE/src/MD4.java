//interface
/*Derive class square from class Rectangle create one more class circle
  create an interface with only one method called area().Implement this
  interface in all classes.Include appropriate data members &constructors
  in all classes.write a java program to accept details of square ,circle &Rectangle
  & display the area.
*/
interface I1
{
	void area();
	
}
class Rectangle implements I1
{
	float l,b;
	Rectangle(float l,float b)
	{
		this.l=l;
		this.b=b;
	}
	public void area()
	{
		float a=l*b;
		System.out.println("Area of Rectangle="+a);
	}
}
class square extends Rectangle
{
	float s;
	square(float l,float b)
	{
		super(l,b);
		s=l;
	}
	public void area()
	{
		float a=s*s;
		System.out.println("Area of square="+a);
		super.area();
	}
}
class circle implements I1
{
	float r;
	circle(float r)
	{
		this.r=r;
	}
	public void area()
	{
		float a=3.14f*r*r;
		System.out.println("Area of circle="+a);
	}
}
 class MD4 
{

	public static void main(String[] args) 
	{
	   square ob=new square(5.8f,3.2f);
	   ob.area();
	   circle ob1=new circle(3.2f);
	   ob1.area();

	}
}
/*------------------output---------
 * Area of square=33.640003
Area of Rectangle=18.560001
Area of circle=32.153603
*/
 
 