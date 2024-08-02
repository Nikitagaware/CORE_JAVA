//sum of digit..................
public class digit_sum 
{
	public static void main(String[] args) 
	{
	   int n=5672;
	   int s=0;
	   while(n>0)
	   {
		    int d=n%10;
		    s=s+d;
		    n=n/10;
		    
	   }
	   System.out.println("sum of digit="+s);
	}

}
/*===============output========================
sum of digit=20
*/