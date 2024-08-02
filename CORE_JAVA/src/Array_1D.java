//Array  of object....
//1D Array...
//Write a java program to calculate the sum of even numbers from an array..

import java.util.*;
public class Array_1D
{
    
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter limit:");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  System.out.println("enter n numbers:");
	  for(int i=0;i<n;i++)
		  a[i]=sc.nextInt();
	  int s=0;
	  for(int i=0;i<n;i++)
	  {
		  if(a[i]%2==0)
			  s=s+a[i];
	  }
	  System.out.println("sum of even numbers="+s);
	  }
	}

/*=================output==================
Enter limit:
3
enter n numbers:
2
4
6
sum of even numbers=12
 */