import java.util.*;
class Item{
	private int x,y;
	public Item(){x=y=0;}
	public Item(int a){x=y=a;}
	public Item(int a,int b){x=a;y=b;}
	public Item(Item a){x=a.x;y=a.y;}
	public void setItem(int a,int b){x=a;y=b;}
	public void putItem(){System.out.print("\nX= "+x+" Y= "+y);}
	public Item substract(Item a)
	{
		Item temp=new Item();
		temp.x=x-a.x;
		temp.y=y-a.y;
		return temp;
	}
}
class SubstractObject
{
	public static void main(String args[])
		{
			Item item1=new Item(10,20);
			Item item2=new Item(5,15);
			Item item3=item1.substract(item2);
			System.out.println("\nResultant:");
			item3.putItem();
		}
}