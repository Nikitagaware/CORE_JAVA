//Constructor..
/* Define a class MyNumber having one privates int data members. write a default
 * constructor  to initialize it to 0 & another constructor to initialized
 * it to a value(use this).write methods isNegative,isPositie,isZero
 * isOdd,isEven.
 */
public class MyNumber
{
    private int n;
    MyNumber()
    {
    	n=0;
    }
    MyNumber(int n)
    {
    	this.n=n;
    }
    boolean isNegative()
    {
    	if(n<0)
    		return true;
    	else
    		return false;
    }
    boolean isPositive()
    {
    	if(n>0)
    		return true;
    	else
    		return false;
    }
    boolean isZero()
    {
    	if(n==0)
    		return true;
    	else
    		return false;
    }
    boolean isEven()
    {
    	if(n%2==0)
    		return true;
    	else
    		return false;
    }
    boolean isOdd()
    {
    	if(n%2!=0)
    		return true;
    	else
    		return false;
    }
	public static void main(String[] args)
	{
	  MyNumber ob=new MyNumber(-77);
	  if(ob.isNegative())
		  System.out.println("Number is -ve");
	
	  if(ob.isPositive())                                                     
		  System.out.println("Number is +ve");
	  if(ob.isZero())
		  System.out.println("Number is 0");
	  if(ob.isEven())
		  System.out.println("Number is even");
	  if(ob.isOdd())
		  System.out.println("Number is odd");
	}
}
/*------------output--------------
 * Number is -ve
Number is odd
*/
