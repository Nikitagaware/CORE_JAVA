/*create package vehicle which will have two classes twowheeler & fourwheeler
 *twowheeler with method display(cc.price).fourwheeler with method display
 *(regno,regyear).  
 */
import Vehicle.*;
class Demo 
{
	public static void main(String[] args)
	{
	    Twowheeler ob=new Twowheeler();
	    fourwheeler ob1=new fourwheeler();
	    ob.display(125,80000);
	    ob1.display(8193, 2013);
	}

}
