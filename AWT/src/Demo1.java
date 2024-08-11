//Radio.button
/*Design screen &performed event screen includes form details for ex.
  Name,address,Gender,subject,class,submit button clear button*/
import java.awt.*;
import java.awt.event.*;
class Demo1 extends Frame implements ActionListener 
{
	Label l1,l2,l3,l4,l5,l6;
	Checkbox c1,c2,c3,c4,c5;
	CheckboxGroup cg;
	TextField t1;
	TextArea ta1,ta2;
	Choice ch1;
	Button b1,b2;
    Demo1()
    {
    	setVisible(true);
    	setSize(500,500);
    	setLayout(new FlowLayout());
    	l1=new Label("Name:");
    	l2=new Label("Address:");
    	l3=new Label("Gender:");
    	l4=new Label("Subject:");
    	l5=new Label("Class:");
    	l6=new Label("Info:");
    	cg=new CheckboxGroup();
    	c1=new Checkbox("Male",cg,true);
    	c2=new Checkbox("Female",cg,false);
    	c3=new Checkbox("C language");
    	c4=new Checkbox("c++");
    	c5=new Checkbox("Java");
    	ch1=new Choice();
    	ch1.add("fy");
    	ch1.add("Sy");
    	ch1.add("ty");
    	ta1=new TextArea(3,40);
    	ta2=new TextArea(5,50);
    	t1=new TextField(10);
    	b1=new Button("submit");
    	b2=new Button("clear");
    	add(l1);
    	add(t1);
    	add(l2);
    	add(ta1);
    	add(l3);
    	add(c1);
    	add(c2);
    	add(l4);
    	add(c3);
    	add(c4);
    	add(c5);
    	add(l5);
    	add(ch1);
    	add(b1);
    	add(b2);
    	add(l6);
    	add(ta2);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getSource()==b1)
    	{
    		String name=t1.getText();
    		String add=ta1.getText();
    		String g=" ";
    		if(c1.getState())
    			g="Male";
    		else
    			g="Female";
    		String s=" ";
    		if(c3.getState())
    			s="C lang";
    		if(c4.getState())
    			s=s+"c++";
    		if(c5.getState())
    			s=s+"Java";
    		String c=ch1.getSelectedItem();
    		ta2.append("Name="+name);
    		ta2.append("\nAddress="+add);
    		ta2.append("\nGender="+g);
    		ta2.append("\nSubject="+s);
    		ta2.append("\nClass="+c);
    	}
    	if(ae.getSource()==b2)
    	{
    		t1.setText(" ");
    		ta1.setText(" ");
    		ta2.setText(" ");
    		c1.setState(false);
    		c2.setState(false);
            c3.setState(false);
            c4.setState(false);
            c5.setState(false);
    	}
    }
	public static void main(String[] args)
	{
	   new Demo1();
	}
}