//LOCAL VARIABLES ASSIGN  TO GLOBAL VARIABLES....
/*create class Emp(eno,ename,sal)accept emp info &disp...*/
public class emp 
{
  int eno;
  String ename;
  float sal;
  void accept(int eno1,String ename1,float s)
  {
	  eno=eno1;
	  ename=ename1;
	  sal=s;
	  
  }
  void disp()
  {
	  System.out.println("emp no="+eno);
	  System.out.println("emp name="+ename);
	  System.out.println("sal="+sal);
  }
	public static void main(String[] args)
	{
		emp ob=new emp();
		ob.accept(101,"Nikita",50000);
		ob.disp();

	}

}
/*===========output================
emp no=101
emp name=Nikita
sal=50000.0
*/