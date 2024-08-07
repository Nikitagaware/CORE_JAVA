//`Abstract
/*Define an abstract class staff with members name & address,define two sub classes
 *fullTimestaff(Dept,sal) & ParttimeStaff(numberofHours,ratePerHour).
 *Define appropriate constructors.create n objects which could be of either
 *fullTimeStaff or PartTimestaff class by asking the users choice.display
 * details of FullTimeStaff & partTimeSatff 
 */
import java.util.*;
abstract class staff
{
	String name,add;
	staff(String name,String add)
	{
		this.name=name;
		this.add=add;
	}
	abstract void disp();
}
class FullTime extends staff
{
	 int sal;
	 String dept;
	 FullTime(String name,String add,int sal,String dept)
	 {
		super(name,add);
		this.sal=sal;
		this.dept=dept;
	 }
	 void disp()
	 {
		 System.out.println("Name="+name);
		 System.out.println("Address="+add);
		 System.out.println("salary="+sal);
		 System.out.println("Dept="+dept);
	 }
}
class PartTime extends staff
{
	 int hours,rate;
	 PartTime(String name,String add,int hours,int rate)
	 {
		 super(name,add);
		 this.hours=hours;
		 this.rate=rate;
	 }
	 void disp()
	 {
		 System.out.println("Name="+name);
		 System.out.println("Address="+add);
		 System.out.println("Hours="+hours);
		 System.out.println("Salary="+(hours*rate));
	 }
}
public class MD 
{
	public static void main(String[] args)
	{
	  int ch,i;
	  Scanner sc=new Scanner(System.in);
	  FullTime ob[]=new FullTime[10];
	  PartTime ob1[]=new PartTime[10];
	  do
	  {
		  System.out.println("1-full Time\n2-Parttime\nEnter choice:");
		  ch=sc.nextInt();
		  switch(ch)
		  {
		  case 1:System.out.println("Enter limit:");
		          int n=sc.nextInt();
		          for(i=0;i<n;i++)
		          {
		        	  System.out.println("Enter name:");
		        	  String name=sc.next();
		        	  System.out.println("Entr address");
		        	  String add=sc.next();
		        	  System.out.println("Enter dept:");
		        	  String dept=sc.next();
		        	  System.out.println("Enter sal:");
		        	  int sal=sc.nextInt();
		        	  ob[i]=new FullTime(name,add,sal,dept);
		          }
		          for(i=0;i<n;i++)
		          {
		        	  ob[i].disp();
		          }
		          break;
		          
		  case 2:System.out.println("Entr limit:");
		          n=sc.nextInt();
		          for(i=0;i<n;i++)
		          {
		        	  System.out.println("Enter name:");
		        	  String name=sc.next();
		        	  System.out.println("Enter Address");
		        	  String add=sc.next();
		        	  System.out.println("Enter hours");
		        	  int hr=sc.nextInt();
		        	  System.out.println("Enter hour per Rate:");
		        	  int r=sc.nextInt();
		        	  ob1[i]=new PartTime(name,add,hr,r);
		          }
		          for(i=0;i<n;i++)
		          {
		        	  ob[i].disp();
		          }
		          break;
		          }
		  }while(ch<3);
	}
}
/*----------output------------------
1-full Time
2-Parttime
Enter choice:
1
Enter limit:
2
Enter name:
nikita
Entr address
shrirampur
Enter dept:
computer
Enter sal:
40000
Enter name:
rohini
Entr address
shrigonda
Enter dept:
science
Enter sal:
60000
Name=nikita
Address=shrirampur
salary=40000
Dept=computer
Name=rohini
Address=shrigonda
salary=60000
Dept=science
1-full Time
2-Parttime
Enter choice:
2
Entr limit:
1
Enter name:
Neha
Enter Address
shirdi
Enter hours
4
Enter hour per Rate:
3
Name=nikita
Address=shrirampur
salary=40000
Dept=computer
1-full Time
2-Parttime
*/