import java.util.*;
class Spiral
{
	private int dimension,matrix[][];
	public Spiral(){dimension=0;}
	public Spiral(int n){dimension=n;matrix=new int[dimension][dimension];}
	public void generate()
	{
		int item=1,t=0,b=dimension-1,r=dimension-1,l=0;
		while(item<=dimension*dimension)
		{
			for(int j=l;j<=r;j++)
				matrix[t][j]=item++;
			t+=1;
			for(int i=t;i<=b;i++)
				matrix[i][r]=item++;
			r-=1;
			for(int j=r;j>=l;j--)
				matrix[b][j]=item++;
			b-=1;
			for(int i=b;i>=t;i--)
				matrix[i][l]=item++;
			l+=1;
		}
	}
	public void print()
	{
		for(int i=0;i<dimension;i++)
		{
			for(int j=0;j<dimension;j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
		}
	}
}

class spiralpattern
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Dimension: ");
		int n=sc.nextInt();
		Spiral pattern=new Spiral(n);
		pattern.generate();
		pattern.print();
	}
}