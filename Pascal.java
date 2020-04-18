import java.util.*;
class Pascal
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dimension: ");
		int n=sc.nextInt();
		int mat[][]=new int[n][n];
		for(int i=0;i<n;i++)
			mat[i][0]=1;
		for(int i=1;i<n;i++)
			for(int j=1;j<n;j++)
				mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
		for(int i=0;i<n;i++)
		{
			for(int j = 0; j <= n-i; j++)
            		System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j<=i)
					System.out.print(" "+mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}