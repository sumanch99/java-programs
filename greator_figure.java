import java.lang.*;
interface Figure
{
	void putData();
	double volume();
}
class Parallelopiped implements Figure
{
	private int l,b,h;
	private double theta;
	public Parallelopiped(){l=b=h=0;theta=0.0;}
	public Parallelopiped(int a,int b,int c,double x){l=a;this.b=b;h=c;theta=Math.toRadians(x);}
	public Parallelopiped(Parallelopiped a){l=a.l;b=a.b;h=a.h;theta=a.theta;}
	public void setData(int a,int b,int c,double x){l=a;this.b=b;h=c;theta=Math.toRadians(x);}
	public void putData()
	{
		System.out.println("Parallelopiped");
		System.out.println("Length= "+l+"\nBreadth="+b+"\nHeight="+h+"\nAngle theta="+theta+" rad");
	}
	public double volume()
	{
		return l*b*h*Math.cos(theta);
	}
}
class Cube implements Figure
{
	private int l;
	public Cube(){l=0;}
	public Cube(int a){l=a;}
	public Cube(Cube a){l=a.l;}
	public void setData(int a,int b){l=a;}
	public void putData()
	{
		System.out.println("Cube");
		System.out.println("Length= "+l);
	}
	public double volume()
	{
		return l*l*l;
	}
}


class greator_figure
{
	public static void main(String args[])
	{
		Figure fig;
		Parallelopiped prl;
		Cube cb;
		prl=new Parallelopiped(5,7,5,90.0);
	    cb=new Cube(2);
	    fig=greater(prl,cb);
	    System.out.println("Greater Figure:");
	    fig.putData();
	    System.out.println("Volume: "+fig.volume());
	}

	static Figure greater(Parallelopiped a,Cube b)
	{
		if(a.volume()>b.volume())
			return a;
		return b;
	}
}




