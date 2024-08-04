//Default constructor..
//Accept two nos using default constructor & display addition...

import java.util.*;
public class Default_addition
{
	Default_addition()       //default constructor
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1:");
		int a=sc.nextInt();
		System.out.println("Enter no2:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition="+c);
	}
	public static void main(String[] args) 
	{
		Default_addition ob= new Default_addition();

	}

}
/*-----------------output----------------------
Enter no1:
11
Enter no2:
44
Addition=55
*/
