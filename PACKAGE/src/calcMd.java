/*create  a package calculate which has two classes square & squareroot
 * square has calc() method to calculate square of a numbr & squareroot
 * has calc() method  to calculate  square root of a number.display the result
 * using calculate package.   
 */
import Calculate.*;
class calcMd 
{
   public static void main(String arg[])
   {
	   square s1=new square();
	   s1.calc(5);
	   squareRoot ob=new squareRoot();
	   ob.calc(15);
	   
   }
}
/*---output------
square=25
square root=3.8729835
*/