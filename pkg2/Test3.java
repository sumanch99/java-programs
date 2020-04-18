package pkg2;
import pkg1.pkg11.*;
public class Test3{
	public static void main(String args[])
	{
		Alpha alp=new Alpha();
		alp.setData(1,2,3);
		alp.putData();
		System.out.println("Output : "+alp);	//alp.toString();
	}
}