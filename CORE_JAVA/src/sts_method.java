//static method
 class sts_method
 {
	 static int c;
	 static void add(int a,int b)
	 {
		 c=a+b;
		 System.out.println("Addition="+c);
	 }
    public static void main(String[] args)
    {
       sts_method ob=new sts_method();
       ob.add(11,22);
       sts_method.add(33,44);
       add(66,11);

	}

}
/*==========output================
 Addition=33
 Addition=77
 Addition=77
 */