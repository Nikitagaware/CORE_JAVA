//3)static block

 class sts_block
 {
    static int a;
    static 
    {
    	a=5;
    	System.out.println("I am Static block");
    	System.out.println("Value="+a);
    }
	public static void main(String[] args) 
	{
	  System.out.println("I am main function");
	}

}
/*====output=====
 I am Static block
 Value=5
 I am main function
 */