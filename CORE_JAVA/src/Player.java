/*create class Cricket player(name,no_of_innings,no_of_notout,total runs,
 * bat_avg)accept info & display.
 */
import java.util.*;
class Player
{
    int innings,no_of_notout,truns,b_avg;
    String name;
    void accept()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter innings, no_of_notout,truns,b_avg,name of the player:");
    name =sc.next();
    no_of_notout=sc.nextInt();
    truns=sc.nextInt();
    b_avg=sc.nextInt();
    innings=sc.nextInt();
    }
    void disp()
    {
    	System.out.println("Inning="+innings);
    	System.out.println("notout="+no_of_notout);
    	System.out.println("truns="+truns);
    	System.out.println("b_avg="+b_avg);
    	System.out.println("name="+name);
    }
	public static void main(String[] args) 
	{
		Player ob=new Player();
		ob.accept();
		ob.disp();
			}

}
