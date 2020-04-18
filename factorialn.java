class Factorial{
	private int n;
	public Factorial(){n=0;}
	public Factorial(int a){n=a;}
	public Factorial(Factorial a){n=a.n;}
	public void setn(int a){n=a;}
	public int putn(){
		System.out.println("\nN= "+n);
		return n;
	}
	public int calculate()
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
}
class factorialn{
	public static void main(String args[])
	{
		Factorial n=new Factorial();
		n.setn(5);
		System.out.println("\nResult is: "+n.calculate());
	}
}