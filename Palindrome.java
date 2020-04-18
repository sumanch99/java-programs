import java.util.*;
class Palindrome{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a word:");
		String str=obj.next();
		if(ispalin(str))
			System.out.println(str+" is a palindrome.");
		else
			System.out.println(str+" is not a palindrome.");
	}
	static boolean ispalin(String a)
	{
		for(int i=0,j=a.length()-1;i<j;i++,j--)
			if(a.charAt(i)!=a.charAt(j))
				return false;
		return true;
	}
}