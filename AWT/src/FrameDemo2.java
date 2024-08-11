//create Frame using extending Frame extends class
import java.awt.*;
class FrameDemo2 extends Frame
{
    FrameDemo2()
    {
    	setVisible(true);
    	setSize(500,500);
    	setTitle("Addition");
    	setLocation(50,100);
    	setBackground(Color.pink);
    	setLayout(new FlowLayout());
    	Label l1=new Label("Enter no1:");
    	add(l1);
    	TextField t1=new TextField(10);
    	add(t1);
    	Button b1=new Button("ok");
    	add(b1);
    }
	public static void main(String[] args) 
	{
	   FrameDemo2 ob=new FrameDemo2();
	}
}
