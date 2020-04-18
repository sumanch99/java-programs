interface Istack
{
	void push(int item);
	int pop();
	boolean StackFull();
	boolean StackEmpty();
}
class Stack implements Istack
{
	private int info[];
	private int top;
	public Stack(int n){info=new int[n];top=-1;}
    public void push(int item)
    {
    	if(StackFull())
    		System.out.println("Stack Overflow");
    	else
    		info[++top]=item;
    }
    public int pop()
    {
    	if(StackEmpty())
    		{
    			System.out.println("Stack Underflow");
    			return 0;
    		}	
    	return info[top--];
    }

    public boolean StackFull()
    {
    	if(top==info.length-1)
    			return true;
    	return false;	
    }
    public boolean StackEmpty()
    {
    	if(top==-1)
    		return true;
    	return false;
    }

}

class TestingStack
{
	public static void main(String args[])
	{
		Istack stk;
		int i=1;
		stk=new Stack(5);
		while(!stk.StackFull())
			stk.push(i++);
		while(!stk.StackEmpty())
			System.out.println("Deleted Element: "+stk.pop());
	}
}