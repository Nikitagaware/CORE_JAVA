/*create class student having rno,sname,marks odf 3 subject.accept student info
 &calculate percentage & display. 
 */
class student 
{
  int rno,s1,s2,s3,tot;
  String sname;
  float per;
  void accept(int rno1,String sname1,int m1,int m2,int m3)
  {
	  rno=rno1;
	  sname=sname1;
	  s1=m1;
	  s2=m2;
	  s3=m3;
  }
  void calc()
  {
	  tot=s1+s2+s3;
	  per=tot/3;
  }
  void disp()
  {
	  System.out.println("Roll no="+rno);
	  System.out.println("Name="+sname);
	  System.out.println("Percentage="+per);
  }
	public static void main(String[] args) 
	{
		student ob=new student();
		ob.accept(101,"Nikita",98,96,99);
		ob.calc();
		ob.disp();

	}

}
/*==========output==========
Roll no=101
Name=Nikita
Percentage=97.0
*/