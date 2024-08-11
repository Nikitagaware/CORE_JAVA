//Example of windoeListener
import java.awt.*;
import java.awt.event.*;
class Window_Listener extends Frame implements WindowListener
{
	Window_Listener()
	{
		setVisible(true);
		setSize(500,500);
		addWindowListener(this);
	}
	public void windowOpened(WindowEvent we)
	{
		setTitle("Window is opened");
	}
	public void windowClosed(WindowEvent we)
	{
		setTitle("Window is closed");
	}
	public void windowClosing(WindowEvent we)
	{
		//dispose();
		setTitle("Window is closing");
	}
	public void windowIconified(WindowEvent we)
	{
		setBackground(Color.yellow);
		setTitle("Window is Iconified");
	}
	public void windowDeiconified(WindowEvent we)
	{
		setBackground(Color.red);
		setTitle("Window is DeIconified");
	}
	public void windowActivated(WindowEvent we)
	{
		setTitle("Window is Activated");
	}
	public void windowDeactivated(WindowEvent we)
	{
		setTitle("Window is deactivated");
	}
	public static void main(String[] args) 
	{
		Window_Listener ob=new Window_Listener();
	}

}
