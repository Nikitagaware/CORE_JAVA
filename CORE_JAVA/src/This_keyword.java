/*This Keyword::there are two uses:1)accessing global variable/members.
 *                                 2)Assigning values from local->to->global
 *1))Accessing global member...
 *Example::                                 
 */
 class This_keyword 
 {
    int a=10;
    void show()
    {
    	int a=20;
    	System.out.println("Value1::"+this.a);
    	System.out.println("Value2::"+a);
    	this.a=99;
    	a=55;
    	System.out.println("value3::"+this.a);
    	System.out.println("value4::"+a);
    }
	public static void main(String[] args) 
	{
	  This_keyword ob=new This_keyword();
	  ob.show();

	}

}
/*==============output===========================
 Value1::10
 Value2::20
 value3::99
 value4::55
 */