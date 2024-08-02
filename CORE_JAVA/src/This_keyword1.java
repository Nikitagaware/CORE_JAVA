/*This Keyword::there are two uses:1)accessing global variable/members.
 *                                 2)Assigning values from local->to->global
 *2))Assigning values from local->to->global
 *syntax:this.global variable=localvariable
 *Example:: create class this_keyword1(eno,ename,sal)use this keyword...                               
 */
 class This_keyword1 
 {
	 int eno;
	 String ename;
	 float sal;
	 void accept(int eno,String ename,float sal)
	 {
		 this.eno=eno;
		 this.ename=ename;
		 this.sal=sal;
	 }
	 void disp()
	 {
		 System.out.println("Eno="+eno);
		 System.out.println("Ename="+ename);
		 System.out.println("sal="+sal);
	 }
	public static void main(String[] args)
	{
	  This_keyword1 ob=new This_keyword1();
       ob.accept(10, "Nikita",5000);
       ob.disp();
	}

}
/*========output====================
 Eno=10
 Ename=Nikita
 sal=5000.0
 */