//Example of ActionListener
/*write a program to create two buttons labeled "GetInfo" & "GET CGPA".
 * when  button 'getInfo' is present it displays your personal
 * information(Name,course,Rollno,college)& When Button 'getcgpa' is pressed,it display
 * your CGPA in previous semester
 */
import java.awt.*;
import java.awt.event.*;
class CGPA extends Frame implements ActionListener
{
   Label l1,l2,l4,l3,l5;
   TextField t1,t2,t3,t4,t5;
   Button b1,b2;
   TextArea ta1;
   CGPA()
   {
	   setVisible(true);
	   setSize(300,300);
	   setLocation(300,300);
	   setLayout(new FlowLayout());
	   l1=new Label("Name");
	   l3=new Label("Roll no");
	   l2=new Label("Course");
	   l4=new Label("College");
	   l5=new Label("CGPA");
	   t1=new TextField(10);
	   t2=new TextField(10);
	   t3=new TextField(10);
	   t4=new TextField(10);
	   t5=new TextField(10);
	   b1=new Button("GetInfo");
	   b2=new Button("Get CGPA");
	   ta1=new TextArea(3,50);
	   add(l1);
	   add(t1);
	   add(l2);
	   add(t2);
	   add(l3);
	   add(t3);
	   add(l4);
	   add(t4);
	   add(l5);
	   add(t5);
	   add(t5);
	   add(ta1);
	   add(b1);
	   add(b2);
	   b1.addActionListener(this);
	   b2.addActionListener(this);
   }
   public void actionPerformed(ActionEvent ae)
   {
	   if(ae.getSource()==b1)
	   {
		   ta1.setText(" ");
		   String s1=t1.getText();
		   String s2=t2.getText();
		   String s3=t3.getText();
		   String s4=t4.getText();
		   ta1.setText("Info");
		   ta1.append("\nName="+s1);
		   ta1.append("\nCourse="+s2);
		   ta1.append("\nRollno="+s3);
		   ta1.append("\nCollege="+s4);
	   }
	   if(ae.getSource()==b2)
	   {
		   ta1.setText(" ");
		   double a=Double.parseDouble(t5.getText());
		   ta1.append("CGPA="+a);
		   double p=a*9;
		   ta1.append("\nPer="+p);
	   }
   }
  public static void main(String[] args)
  {
	 CGPA ob=new CGPA();

	}

}
