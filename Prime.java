import java.util.*;
class Prime{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n=obj.nextInt();
		if(isprime(n,2))
			System.out.println(n+" is a prime number.");
		else
			System.out.println(n+" is not a prime number.");
	}
	static boolean isprime(int n,int i)
	{
		if(i==n/2)
			return true;
		if(n%i==0)
			return false;
		return isprime(n,i+1);
	}
}