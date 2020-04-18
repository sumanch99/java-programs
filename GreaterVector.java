import java.util.*;
import java.lang.Math.*;
class Vector{
	private int vect[],n;
	private double length;
	private double getLength()
	{
		double term=0;
		for(int i=0;i<n;i++)
			term=term+vect[i]*vect[i];
		return Math.sqrt(term);
	}
	public void setdata(int a[],int n)
	{
		vect=a;
		this.n=n;
		length=getLength();
	}
	public double getdata()
	{
		return length;
	}
	public void putdata()
	{
		System.out.println("Dimension= "+n);
		System.out.print("Elements: ");
		for(int i=0;i<n;i++)
			System.out.print(vect[i]+" ");
		System.out.println("\nLength= "+length);
	} 
}


class GreaterVector
{
	public static void main(String args[])
	{
		Vector vect1=new Vector();
		Vector vect2=new Vector();
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the dimension of 1st vector: ");
		int n1=obj.nextInt();
		int arr1[]=new int[n1];
		System.out.print("Enter "+n1+" elements: ");
		for(int i=0;i<n1;i++)
			arr1[i]=obj.nextInt();
		System.out.print("Enter the dimension of 2nd vector: ");
		int n2=obj.nextInt();
		int arr2[]=new int[n2];
		System.out.print("Enter "+n2+" elements: ");
		for(int i=0;i<n2;i++)
			arr2[i]=obj.nextInt();
		vect1.setdata(arr1,n1);
		vect2.setdata(arr2,n2);
		System.out.println("Vector with greater length is: ");
		if(vect2.getdata()>vect1.getdata())
			vect2.putdata();
		else 
			vect1.putdata();
	}
}