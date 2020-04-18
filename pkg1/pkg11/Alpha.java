package pkg1.pkg11;
import pkg1.Item;
public class Alpha{
	private int x,y,z;
	public void setData(int a,int b,int c)
	{
		x=a;y=b;z=c;
	}
	public void putData()
	{
		System.out.println(x+" "+y+" "+z);
	}
	public String toString()
	{
		String s="Hello Java,Result= "+(x+y+z);
		return s;
	}
}