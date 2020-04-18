class Item{
	private int x,n;
	public Item(){x=n=0;}
	public Item(int a,int b){x=a;n=b;}
	public Item(int a){x=n=a;}
	public Item(Item a){x=a.x;n=a.n;}
	public void setItem(int a,int b){x=a;n=b;}
	public void putItem(){System.out.println("X= "+x+"n= "+n);}
	public int calculate()
	{
		int term,result=1;
		for(int i=1;i<=n;i++)
			{
				term=1;
				for(int j=1;j<=i;j++)
					term*=x;
				result+=term;
			}
		return result;		
	}
}
class polynomial{
	public static void main(String args[])
	{
		Item x=new Item(2,3);
		System.out.println("\nResult: "+x.calculate());
	}
}