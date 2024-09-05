//JScrollBar..
//Accept three Scrollbar & display color shed..
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ScrollDemo extends Frame implements AdjustmentListener
{
   JScrollBar s1,s2,s3;
   ScrollDemo()
   {
	   setVisible(true);
	   setSize(500,500);
	   s1=new JScrollBar();
	   s1.setMinimum(0);
	   s1.setMaximum(255);
	   s1.setOrientation(JScrollBar.HORIZONTAL);
	   s2=new JScrollBar();
	   s2.setMinimum(0);
	   s2.setMaximum(255);
	   s2.setOrientation(JScrollBar.HORIZONTAL);
	   s3=new JScrollBar();
	   s3.setMinimum(0);
	   s3.setMaximum(255);
	   s3.setOrientation(JScrollBar.HORIZONTAL);
	   Panel p1=new Panel();
	   p1.setLayout(new GridLayout(3,1));
	   p1.add(s1);
	   p1.add(s2);
	   p1.add(s3);
	   add(p1,BorderLayout.NORTH);
	   s1.addAdjustmentListener(this);
	   s2.addAdjustmentListener(this);
	   s3.addAdjustmentListener(this);
   }
   public void adjustmentValueChanged(AdjustmentEvent ae)
   {
	   Color c=new Color(s1.getValue(),s2.getValue(),s3.getValue());
	   setBackground(c);
   }
	public static void main(String[] args)
	{
	    new ScrollDemo();
     
	}

}
