//design screen of LoginPage....
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Login extends JFrame implements ActionListener
{
   JLabel l1,l2;
   JTextField t1;
   JPasswordField t2;
   JButton b1,b2;
   Login()
   {
	   setVisible(true);
	   setSize(500,500);
	   setLayout(new FlowLayout());
	   l1=new JLabel("UserName");
	   l2=new JLabel("Password");
	   t1=new JTextField(10);
	   t2=new JPasswordField(10);
	   b1=new JButton("Login");
	   b2=new JButton("reset");
	   Panel p1=new Panel();
	   p1.setLayout(new GridLayout(3,2));
	   p1.add(l1);
	   p1.add(t1);
	   p1.add(l2);
	   p1.add(t2);
	   p1.add(b1);
	   p1.add(b2);
	   add(p1);
	   b1.addActionListener(this);
	   b2.addActionListener(this);
   }
   public void actionPerformed(ActionEvent ae)
   {
	    if(ae.getSource()==b1)
	    {
	    	String u=t1.getText();
	    	String p=t2.getText();
	    	if(u.equals("rbnb")&&p.equals("123"))
	    		JOptionPane.showMessageDialog(this, "Login Successfully");
	    	else
	    		JOptionPane.showMessageDialog(this,"Invalid User or Passs");
	    	
	    }
	    if(ae.getSource()==b2)
	    {
	    	t1.setText(" ");
	    	t2.setText(" ");
	    	
	    }
   }
	public static void main(String[] args) 
	{
	    new Login();
	}

}
