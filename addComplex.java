import java.util.*;
class Complex{
	private int real,imag;
	public Complex(){real=imag=0;}
	public Complex(int a){real=imag=a;}
	public Complex(int a,int b){real=a;imag=b;}
	public Complex(Complex a){real=a.real;imag=a.imag;}
	public void setComplex(int a,int b){real=a;imag=b;}
	public void putComplex(){System.out.print("\n"+real+" + i"+imag);}
	public Complex add(Complex a)
	{
		Complex temp=new Complex();
		temp.real=real+a.real;
		temp.imag=imag+a.imag;
		return temp;
	}
}
class addComplex
{
	public static void main(String args[])
		{
			Complex number1=new Complex(100,50);
			Complex number2=new Complex(20,75);
			Complex number=number1.add(number2);
			System.out.println("\nResultant:");
			number.putComplex();
		}
}