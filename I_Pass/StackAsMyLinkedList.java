public class StackAsMyLinkedList<E>
{
	MyLinkedList<E> theStack;
	
    public StackAsMyLinkedList()
    {
		theStack = new MyLinkedList<E>();
    }
	
    public void push(E newElement) 
    {
		theStack.prepend(newElement);
    }
	
	public String josephus()
	{
		return theStack.josephus(theStack);
	}
	
	public String toString()
	{
		return theStack.toString();
	}
}

