import java.util.*;
class Student
 {
    int rno;
    String sname,sclass;
    Scanner sc=new Scanner(System.in);
    void accepts()
    {
    	System.out.println("Enter rno:");
    	rno=sc.nextInt();
    	System.out.println("Enter sname:");
    	sname=sc.next();
    	System.out.println("Enter sclass:");
    	sclass=sc.next();
    }
}
class Exam extends Student
{
	int m[]=new int[6];
	void acceptmarks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter siz subjects marks:");
		for(int i=0;i<6;i++)
		{
			m[i]=sc.nextInt();
		}
	}
}
class Result extends Exam
{
	int tot=0;
	float p;
	void calc()
	{
		for(int i=0;i<6;i++)
		{
			tot=tot+m[i];
		}
		p=(float)tot/6;
	}
	void disp()
	{
	   System.out.println("Roll no="+rno);
	   System.out.println("Sname="+sname);
	   System.out.println("Class="+sclass);
	   System.out.println("total="+tot);
	   System.out.println("Percentage="+p);
    }
}
	public class Student1{
 public static void main(String arg[])
 {
     Result ob=new Result();
     ob.accepts();
     ob.acceptmarks();
     ob.calc();
     ob.disp();
 
 }
}