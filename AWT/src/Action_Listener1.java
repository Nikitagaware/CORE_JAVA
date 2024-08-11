//Example of ActionListener
/*write a program to create two buttons named "Red" & "blue" when a buttons is 
 * pressed the background color should be set to the color named by the buttons
 */
import java.awt.*;
import java.awt.event.*;
class Action_Listener1 extends Frame implements ActionListener
{
  Button b1,b2;
  Action_Listener1()
  {
	  setVisible(true);
	  setSize(500,500);
	  setLayout(new FlowLayout());
	  b1=new Button("RED");
	  b2=new Button("BLUE");
	  add(b1);
	  add(b2);
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  
  }
  public void actionPerformed(ActionEvent ae)
  {
	  if(ae.getSource()==b1)
	  {
		  setBackground(Color.red);
	  }
	  if(ae.getSource()==b2)
	  {
		  setBackground(Color.blue);
	  }
}

	public static void main(String[] args) 
	{
	   Action_Listener1 ob=new Action_Listener1();
	}

}
