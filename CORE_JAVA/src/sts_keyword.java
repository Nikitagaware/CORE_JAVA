/*Static Keyword: there are three uses:
 * 1)static variable
 * 2)static method
 * 3)static block
 *1)Static variable example
 */
class sts_keyword 
{
  static int a=5;
  void show()
  {
	System.out.println("Value2="+a);  
	
  }
  public static void main(String arg[])
  {
	  System.out.println("I am main");
	  System.out.println("value1="+a);
	  sts_keyword ob=new sts_keyword();
	  ob.show();
  }
}
/*=======output=====================
I am main
value1=5
Value2=5
*/
