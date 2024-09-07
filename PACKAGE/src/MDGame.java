/*write a package for games in java,which have two classes indoor & outdoor
 *use a function display() to generate the list of player for specific
 *games (use parameterized constructor,finalize() method & array of objects). 
 */
import games.*;
import java.util.*;
class MDGame 
{
   public static void main(String arg[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the limit");
	   int n=sc.nextInt();
	   indoor ob[]=new indoor[n];
	   outdoor ob1[]=new outdoor[n];
	   for(int i=0;i<n;i++)
	   {
		   System.out.println("enter the indoor game name:");
		   String name=sc.next();
		   System.out.println("Enter the no of Players");
		   int players=sc.nextInt();
		   ob[i]=new indoor(name,players);
	   }
	   for(int i=0;i<n;i++)
	   {
		   System.out.println("enter the outdoor game name:");
		   String name=sc.next();
		   System.out.println("enter the no of players");
		   int players=sc.nextInt();
		   ob1[i]=new outdoor(name,players);   //parameterized constructor..
		   
	   }
	   System.out.println("Display indoor:");
	   for(int i=0;i<n;i++)
	   {
		   ob[i].disp();
	   }
	   System.out.println("display outdoor");
	   for(int i=0;i<n;i++)
	   {
		   ob1[i].disp();
	   }
   }
}
/*-------------output------------
enter the limit
2
enter the indoor game name:
caram
Enter the no of Players
4
enter the indoor game name:
chess
Enter the no of Players
2
enter the outdoor game name:
cricket
enter the no of players
12
enter the outdoor game name:
kho-kho
enter the no of players
8
Display indoor:
Indoor game Name=null
No of players=4
Indoor game Name=null
No of players=2
display outdoor
Outdoor Game Name=cricket
no of Players=12
Outdoor Game Name=kho-kho
no of Players=8
*/