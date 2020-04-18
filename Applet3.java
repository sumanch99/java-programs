import java.applet.*;
import java.awt.*;

public class Applet3 extends Applet
{
	TextField str1,str2;
	Button btn;
	int x,y,z,m,n;
	String result;
	public void init()
	{
		x=y=0;
		str1=new TextField();
		str2=new TextField();
		btn = new Button();
		add(str1);
		add(str2);
	}
	public void start()
	{
			m++;
			repaint();
	}
	public void stop()
	{
			n++;
			repaint();
	}
	public void paint(Graphics g)
	{
		x=Integer.parseInt(str1.getText());
		y=Integer.parseInt(str2.getText());
		z=x+y;
		result="Sum of "+x+" and "+y+" is= "+z;
		g.drawString(result,10,200);
		g.drawRect(10,50,x,y);
		g.drawString("Maximised: "+m,10,230);
		g.drawString("Minimised: "+n,10,240);
	}
	public boolean action(Event e,Object obj)
	{
		repaint();
		return true;
	}
}