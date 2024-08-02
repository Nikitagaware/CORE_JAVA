/*create a class area that calculate area of  circle,rectangle,triangle
 & square.using function.
 */
public  class Area 
 {
	 void circle(float r)
	 {
		 float a=3.14f*r*r;
		 System.out.println("area if Circle="+a);
	 }
	 void rectangle(float l,float b)
	 {
		 float  a=l*b;
		 System.out.println("Area of rectangle="+a);
	 }
	 void triangle(float b1,float h)
	 {
		 float a=0.5f*b1*h;
		 System.out.println("Area of triangle="+a);
	 }
	 public static void main(String[] args)
	 {
	    Area ob=new Area();
	    ob.circle(3);
	    ob.rectangle(50,100);
	    ob.triangle(50, 60);
	 }
 }
/*=====output==================
 area if Circle=28.26
Area of rectangle=5000.0
Area of triangle=1500.0
*/
