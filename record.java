import java.util.*;
class Student{
	private int roll,sub1,sub2,total;
	public Student(){roll=sub1=sub2=0;}
	public Student(int a){roll=a;sub1=sub2=0;}
	public Student(int a,int b){roll=a;sub1=b;sub2=0;}
	public Student(int a,int b,int c){roll=a;sub1=b;sub2=c;}
	public Student(Student a){roll=a.roll;sub1=a.sub1;sub2=a.sub2;total=a.total;}
	public void setStudent(int a,int b,int c)
	{
		roll=a;
		sub1=b;
		sub2=c;
		total=calculateTotal();
	}
	public void putStudent()
	{
		System.out.println("Roll Number= "+roll);
		System.out.println("Marks in sub1= "+sub1+" in sub2= "+sub2);
	}
	private int calculateTotal()
	{
		total=sub1+sub2;
		return total;
	}
	public void displayRecord()
	{
		System.out.println(roll+"   "+sub1+"   "+sub2+"   "+total);
	}
	public int putTotal()
	{
		return total;
	}

}
class Record{
	public static void main(String args[])
	{
		Student std[];
		int x,y,z,n,i;
		System.out.println("How many Students?: ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		std=new Student[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter student "+(i+1)+"'s roll number , marks in sub1 & sub2 accordingly: ");
			x=obj.nextInt();
			y=obj.nextInt();
			z=obj.nextInt();
			std[i]=new Student();
			std[i].setStudent(x,y,z);
		}
		sortStudent(std,n);
		System.out.println("Record: ");
		System.out.println("Roll   Sub1   Sub2   Total ");
		for(i=0;i<n;i++)
			std[i].displayRecord();
	}
	public static void sortStudent(Student st[],int n)
	{
		Student temp=new Student();
		for(int i=0;i<n;i++)
			for(int j=0;j<n-i-1;j++)
				if(st[i].putTotal()<st[i+1].putTotal())
				{
					temp=st[j];
					st[j]=st[j+1];
					st[j+1]=temp;
				}
	}
}