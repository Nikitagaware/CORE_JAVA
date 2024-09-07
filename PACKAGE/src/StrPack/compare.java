package StrPack;
public class compare 
{
   public void compare(String s1,String s2)
   {
	   int k=s1.compareTo(s2);
	   if(k==0)
		   System.out.println("String are Same");
	   if(k>0)
		   System.out.println("First String greater");
	   if(k<0)
		   System.out.println("Second String greater");
	   
   }
}
