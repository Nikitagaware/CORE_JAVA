//array of object..
//create class name emp that accept n emp info & display
import java.util.*;
class array_of_obj 
{
   int eno;
   String ename;
   float sal;
   void accept()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter empno ename sal:");
	   eno=sc.nextInt();
	   ename=sc.next();
	   sal=sc.nextFloat();
	   
   }
   void disp()
   {
	   System.out.println("emp no="+eno);
	   System.out.println("ename="+ename);
	   System.out.println("sal="+sal);
   }
	public static void main(String[] args)
	{
	   array_of_obj ob[]=new array_of_obj[100];
	   int ch,i,n=0;
	   Scanner sc=new Scanner(System.in);
	   do
	   {
		   System.out.println("1-accept \n2-Display\n3-search by number");
		   System.out.println("enter Choice:");
		   ch=sc.nextInt();
		   switch(ch)
		   {
		   case 1:System.out.println("entr limit");
		           n=sc.nextInt();
		           for(i=0;i<n;i++)
		           {
		        	   ob[i]=new array_of_obj();
		        	   ob[i].accept();
		           }
		           break;
		   case 2:for(i=0;i<n;i++)
		          {
			       ob[i].disp();
		           }
		         break;
		   case 3:int flag=0;
		          System.out.println("enter emp no to search");
		          int num=sc.nextInt();
		          for(i=0;i<n;i++)
		          {
		        	  if(ob[i].eno==num)
		        	  {
		        		  flag=1;
		        		  break;
		        		  
		        	  }
		          }
		          if(flag==1)
		        	  ob[i].disp();
		          else
		        	  System.out.println("Record not found");
		          break;
		          
		      default:System.out.println("Invalid choice:");
		   }
	   }while(ch<4);
	}
}
/*-----------output-------------------------------
 * 1-accept 
2-Display
3-search by number
enter Choice:
1
entr limit
5
Enter empno ename sal:
1
nikita
5000
Enter empno ename sal:
2
yogita
2000
Enter empno ename sal:
3
madhuri
50900
Enter empno ename sal:
4
Rani
40000
Enter empno ename sal:
5
Sakshi
56000
1-accept 
2-Display
3-search by number
enter Choice:
2
emp no=1
ename=nikita
sal=5000.0
emp no=2
ename=yogita
sal=2000.0
emp no=3
ename=madhuri
sal=50900.0
emp no=4
ename=Rani
sal=40000.0
emp no=5
ename=Sakshi
sal=56000.0
1-accept 
2-Display
3-search by number
enter Choice:
3
enter emp no to search
3
emp no=3
ename=madhuri
sal=50900.0
1-accept 
2-Display
3-search by number
enter Choice:
4
Invalid choice:
*/
