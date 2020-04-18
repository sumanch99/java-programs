import java.util.*;
class Calculate
{
	private int x,y,z;
	public void input(int a,int b,int c)
		{
		 x=a;
		 y=b;
		 z=c;
		}
	public double result()
		{
		 return(x*x+y*y+z*z-x*y*z);
		}
}



class Test1
{
	public static void main(String args[]){
		int x,y,z;
		double result;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the values of x,y & z:");
		x=obj.nextInt();
		y=obj.nextInt();
		z=obj.nextInt();
		Calculate ref;
		ref=new Calculate();
		ref.input(x,y,z);
		result=ref.result();
		System.out.println("Result is: "+result);
		}
}