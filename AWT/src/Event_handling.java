//Event Handling
/*Enter product name &display in list or perform add,remove,clear,
 * exit operation..*/
 
import java.awt.*;
import java.awt.event.*;       //package
class Event_handling extends Frame implements ActionListener
{
  Label l1,l2;
  TextField t1;
  List lst;
  Button b1,b2,b3,b4;
  Event_handling()
  {
  	setVisible(true);
  	setSize(400,400);
  	setLayout(new FlowLayout());
  	l1=new Label("Enter Product");
  	l2=new Label("All product:");
  	t1=new TextField(10);
  	lst=new List(10);
  	b1=new Button("Add");
  	b2=new Button("Remove");
  	b3=new Button("Clear");
  	b4=new Button("Exit");
  	add(l1);
  	add(t1);
  	add(l2);
  	add(lst);
  	add(b1);
  	add(b2);
  	add(b3);
  	add(b4);
  	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
	  if(ae.getSource()==b1)
	  {
		  String s1=t1.getText();
		  lst.add(s1);
	  
	  if(ae.getSource()==b2)
	  {
		  lst.remove(lst.getSelectedItem());
	  }
	  if(ae.getSource()==b3)
	  {
		  lst.removeAll();            //lst.clear();
	  }
	   if(ae.getSource()==b4)
		  dispose();
	  }
  }
	public static void main(String[] args)
	{
		Event_handling ob=new Event_handling();
	}

}

