package pkg2;
import pkg1.*;
class Test2
{
	public static void main(String args[])
	{
		Item ref=new Item();
		ref.input(15,25);
		ref.output();
	}
}