//MouseListener
//Display mouse event message on Label
import java.awt.*;
import java.awt.event.*;
class Mouse_Listener extends Frame implements MouseListener
{
	Label l1;
	Mouse_Listener()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		l1=new Label("this is mouse event message..");
		add(l1);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		l1.setText("Mouse Clicked event..");
	}
	public void mousePressed(MouseEvent me)
	{
		l1.setText("Mouse Pressed event..");
	}

	public void mouseReleased(MouseEvent me)
	{
		l1.setText("Mouse released event..");
	}
	public void mouseEntered(MouseEvent me)
	{
		l1.setText("Mouse Entered event..");
	}
	public void mouseExited(MouseEvent me)
	{
		l1.setText("Mouse Exited event..");
	}
	public static void main(String[] args) 
	{
          Mouse_Listener ob=new Mouse_Listener();
	}
}
