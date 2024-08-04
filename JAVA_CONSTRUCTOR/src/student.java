//Constructors
import java.util.*;
public class student
{
    int rno;
    String name;
    float per;
    student()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter rno name per");
    	rno=sc.nextInt();
    	name=sc.next();
    	per=sc.nextFloat();
      }
    static void sort_student(student ob[],int n)
    {
    	 int pass,i;
    	 student t;
    	 for(pass=1;pass<n;pass++)
    	 {
    		 for(i=0;i<n-pass;i++)
    		 {
    			 if(ob[i].per<ob[i+1].per)
    			 {
    				 t=ob[i];
    				 ob[i]=ob[i+1];
    				 ob[i+1]=t;
    			 }
    		 }
    	 }
    	 for(i=0;i<n;i++)
    	 {
    		 System.out.println(ob[i].rno+"\t"+ob[i].name+"\t"+ob[i].per);
    	  }
     }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enterlimit:");
    	int n=sc.nextInt();
    	student ob[]=new student[n];
    	for(int i=0;i<n;i++)
    	{
    		ob[i]=new student(); //memory allocate & calling default constructor..
    	}
      sort_student(ob,n);
    }
}
/*----------------output------------
Enterlimit:
3
Enter rno name per
1
nikita
67.00
Enter rno name per
2
bhakti
89.45
Enter rno name per
3
neha
56.00
2	bhakti	89.45
1	nikita	67.0
3	neha	56.0
*/