//Interface
/*Define an interface "Integer" with a abstract method check write a java program
 *to check whether  a given number is positive or negative. 
 */
interface Integer
{
	void check(int n);
}
class Demo1 implements Integer
{
	public void check(int n)
	{
		if(n>0)
			System.out.println("No is Positive");
		else
			System.out.println("No. is Negative");
	}
}
 class MD
 {
	public static void main(String[] args)
	{
        Demo1 ob=new Demo1();
        ob.check(33);
	}
	}

/*----------------output-----------
 No is Positive
 */