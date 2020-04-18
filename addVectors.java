import java.util.*;
class addVectors{
	public static void main(String args[])
		{
		int n,i;
		Scanner obj=new Scanner(System.in);
		System.out.println("\nHow many elements in each vector?: ");
		n=obj.nextInt();
		int a[]=new int[n];
		System.out.println("\nEnter elements for 1st vector: ");
		for(i=0;i<n;i++)
			a[i]=obj.nextInt();
		int b[]=new int[n];
		System.out.println("\nEnter elements for 2nd vector: ");
		for(i=0;i<n;i++)
			b[i]=obj.nextInt();
		int c[]=new int[n];
		for(i=0;i<n;i++)
			c[i]=a[i]+b[i];
		System.out.println("\nResultant Vector:");
		for(i=0;i<n;i++)
			System.out.print(c[i]+" ");
		}
	}