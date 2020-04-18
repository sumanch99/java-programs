import java.util.*;
class Compute{
	private int n,sum=0;
	public void input(int x)
		{
			n=x;
		}
	public int result()
		{
			for(int i=1;i<=n;i++)
				sum+=i;
			return sum;
		}	
}
class Test2{
	public static void main(String args[])
		{
			int n;
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the value of n:");
			n=obj.nextInt();
			Compute ref;
			ref = new Compute();
			ref.input(n);
			System.out.print("Result: "+ref.result());
		}
}