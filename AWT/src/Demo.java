//Checkbox..
//Design screen & performed event...

import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
	Checkbox c1,c2,c3,c4;
	Button b1;
	TextArea ta;
	Demo()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		c1=new Checkbox("Java");
		c2=new Checkbox("PHP");
		c3=new Checkbox("PYTHON");
		c4=new Checkbox("TCS");
		b1=new Button("OK");
		ta=new TextArea(4,50);
		ta.setFont(new Font("Arial",Font.BOLD,17));
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(b1);
		add(ta);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s1=" ";
			if(c1.getState()==true)
				s1="JAVA";
			if(c2.getState()==true)
				s1=s1+",PHP";
			if(c3.getState())
				s1=s1+",PYTHON";
			if(c4.getState())
				s1=s1+",TCS";
			ta.setText("Selected sub:\n");
			ta.append(s1);
		}
	}
	public static void main(String[] args)
	{
	   new Demo();

	}

}
