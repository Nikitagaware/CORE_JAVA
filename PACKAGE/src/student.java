/*write a java program to create package "sy" which has a classs symarks(members computerTotal,
 * MathTotal,&electronics total)
 * create another package TY which has a class TYmarks (members-theory,practicals)
 *create n objects of student class (having rollnumber,name,symarks,tymarks)
 *Add the marks of SY & TY computer subjects & calculate  the grade 
 *('A' for >=70,'B' for>=60 'C' for>=50.pass class for>=40 else 'FAIL') & display the result 
 *of the student in proper format. 
 */
import SY.*;
import TY.*;
import java.util.*;
public class student
{
   int rno;
   String name;
   void accept()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the rollno:");
       rno=sc.nextInt();
       System.out.println("Enter the name:");
       name=sc.next();
       
   }
   void disp()
   {
	   System.out.println("roll no="+rno);
	   System.out.println("Name="+name);
   }
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter limit:");
	   int n=sc.nextInt();
	   symarks SY[]=new symarks[n];
	   tymarks TY[]=new tymarks[n];
	   student s[]=new student[n];
	   for(int i=0;i<n;i++)
	   {
		   SY[i]=new symarks();
		   TY[i]=new tymarks();
		   s[i]=new student();
		   s[i].accept();
		   SY[i].accept();
		   TY[i].accept();
	   }
	   for(int i=0;i<n;i++)
	   {
		   s[i].disp();
		   int tot=SY[i].comp+TY[i].theory+TY[i].practical;
		   float p=(float)tot/3;
		   System.out.println("Total="+tot);
		   System.out.println("Per="+p);
		   if(p>=70)
			   System.out.println("Grade=O");
		   else if(p>=60)
			   System.out.println("Grade=A");
		   else if(p>=50)
			   System.out.println("Grade=B");
		   else if(p>=40)
			   System.out.println("Grade=C");
		   else
			   System.out.println("Fail ...");
	   }
	}
}
/*----output-------------------------
 * Enter limit:
3
enter the rollno:
1
Enter the name:
nita
Enter the computer marks:
45
Enter the math Marks:
66
Enter the electronics marks
65
Enter the theory Marks:
53
Enter the parctical Marks
55
enter the rollno:
2
Enter the name:
ritha
Enter the computer marks:
89
Enter the math Marks:
78
Enter the electronics marks
88
Enter the theory Marks:
56
Enter the parctical Marks
89
enter the rollno:
3
Enter the name:
rohini
Enter the computer marks:
97
Enter the math Marks:
67
Enter the electronics marks
56
Enter the theory Marks:
66
Enter the parctical Marks
84
roll no=1
Name=nita
Total=153
Per=51.0
Grade=B
roll no=2
Name=ritha
Total=234
Per=78.0
Grade=O
roll no=3
Name=rohini
Total=247
Per=82.333336
Grade=O
		   
 */