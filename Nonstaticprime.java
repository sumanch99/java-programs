import java.util.*;
class Item{
	private int n,counter=2;
	public void input(int n)
	{
		this.n=n;
	}
	public int output()
	{
		System.out.println("N = "+n);
		return n;
	}
	public boolean isPrime()
	{
		if(counter>=n/2)
			return true;
		if(n%counter==0)
			return false;
		counter++;
		return isPrime();
	}
}


class Nonstaticprime{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int n=obj.nextInt();
		Item ref=new Item();
		if(n==0||n==1)
			System.out.println(n+" is neither prime nor non prime.");
		else
		{	ref.input(n);
			if(ref.isPrime())
				System.out.println(n+" is a prime number.");
			else
				System.out.println(ref.output()+" is not a prime number. ");
		}	
	}
}