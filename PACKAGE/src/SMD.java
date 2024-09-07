/*write a package strpack which has two classes concat & compare.
 * conact class has a method to concatenate two Strings & compare class 
 * has a method to compare  two strings.Display appropriate messages.
 */
import StrPack.*;
class SMD 
{
	public static void main(String[] args) 
	{
	    concat ob=new concat();
	    compare ob1=new compare();
	    ob.concat("cdj", "rbnb");
	    ob1.compare("cdj", "rbnb");
	}
}
/*----output-------
concat String =cdjrbnb
Second String greater
*/