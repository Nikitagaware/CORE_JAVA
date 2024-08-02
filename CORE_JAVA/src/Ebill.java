/*create class Electricity bill that accept old reading & new reading from user calculate
 *calculate total units<100 then rate per unit:5rs.unit between 100 to 200.Rate 10Rs 
 *per unit.unit>200 then rate 15 rs per unit.Add meter charges 140 rs.Bill amount greater
 *than 1000 then add tax 10%.calculate total bill amount &display...
 */
import java.util.*;
class Ebill 
{
   int or,nr,unit;
   float tot,tax;
   void accept()
   {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter old reading:");
	  or=sc.nextInt();
	  System.out.println("Enter New Reading:");
	  nr=sc.nextInt();
   }
   void calc()
   {
	   unit=nr-or;
	   if(unit<100)
		   tot=unit*5;
	   else if(unit>=100 && unit<200)
		   tot=unit*10;
	   else
		   tot=unit*15;
	   tot=tot+140;
	   if(tot>=1000)
		   tax=(float)tot*10/100;
	   tot=tot+tax;
   }
   void disp()
   {
	   System.out.println("old reading="+or);
	   System.out.println("New Reading="+nr);
	   System.out.println("Total units="+unit);
	   System.out.println("Tax ="+tax);
	   System.out.println("Bill amount="+tot);
   }
	public static void main(String[] args) 
	{
	   Ebill ob=new Ebill();
	   ob.accept();
	   ob.calc();
	   ob.disp();
	   
	}

}
/*=====output====================
enter old reading:
111
Enter New Reading:
1356
old reading=111
New Reading=1356
Total units=1245
Tax =1881.5
Bill amount=20696.5
*/