/*create a class Book having data members bookno,bname,author,price,quantity
 * accept book info,calculate amount and display.
 */
 class Book 
 {
	 int bno,quan;
	 String bname,author;
	 double price,tprice;
	 void accept(int bno1,double price1,int quan1,String bname1,String auth)
	 {
		 bno=bno1;
		 price=price1;
		 quan=quan1;
		 bname=bname1;
		 author=auth;
	 }
	 void calc()
	 {
          tprice=price*quan;
	 }
	 void disp()
	 {
		 System.out.println("Bno="+bno);
		 System.out.println("Bname="+bname);
		 System.out.println("Author="+author);
		 System.out.println("Total price="+tprice);
	 }
    public static void main(String[] args)
    {
		Book ob=new Book();
		ob.accept(111,100,50,"JAVA","James gosling");
		ob.calc();
		ob.disp();
	}

}
/*================output====================
 Bno=111
 Bname=JAVA
 Author=James gosling
 Total price=5000.0
*/ 