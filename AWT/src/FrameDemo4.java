//AWT-LISTMETHOD...
import java.awt.*;
class FrameDemo4 extends Frame
{
    Label l1,l2;
    TextField t1;
    List lst;
    Button b1,b2,b3,b4;
    FrameDemo4()
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
    }
	public static void main(String[] args)
	{
	  FrameDemo4 ob=new FrameDemo4();
	}

}
