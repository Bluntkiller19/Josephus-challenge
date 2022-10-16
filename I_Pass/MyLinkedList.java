public class MyLinkedList<E>
{
  	private Node<E> head, tail;
	
  	public MyLinkedList()
	{
     	head = null;
		tail = null;
  	}
	
	private static class Node<E> 
	{
		E element;
		Node<E> next;

		public Node(E element) 
		{
			this.element = element;
			next = null;
		}
	}

	public void prepend(E e) 
	{
		Node<E> newNode = new Node<>(e); 
		newNode.next = head; 
		head = newNode; 
  
		if (tail == null) 
			tail = head;
	}

	public boolean delete(E item)
	{
		Node<E> ptr = head;
		Node<E> prvPtr = null;
		while (ptr!= null&& ((Comparable)ptr.element).compareTo(item)!= 0)
		{
			prvPtr=ptr;
			ptr=ptr.next;
		}
		if (ptr == null)
			return false;
		if (ptr==head)
		   head= head.next;
		else
			prvPtr.next=ptr.next;
		if (ptr==tail)
			tail=prvPtr;
		return true;
	}
	
	public String josephus(MyLinkedList <E> paramList)//My method to the josephus problem
	{
		Node<E> ptr = head;
		int n = 0;
		if(head == null)//checks if the list is empty
			return "The list is empty!";
		while(head != tail)//this while loop will continue while the stack have more than one valaue in it.
		{
			n++;
			if(n == 2)//every time n reach aa valaue of 2 the pointer.element wil be deleted for that position!
			{
				if(ptr == null)//since the pointer valaue runs from front to end when the poiner = null we let it start at the head again
					ptr = head;
				paramList.delete(ptr.element);
				n = 0;//resets n to 0
			}
			if(ptr == null)//ptr needs to start again at the head if the pointer is at the end of the stack
			{
				ptr = head;
				n --;
			}
			else
				ptr = ptr.next;//get next element in stack
		}
		return "The survivor is: " + paramList.toString();
	}
 
	public String toString() 
	{
		String result = "";

		Node<E> ptr = head;
		for (ptr= head;ptr!=null; ptr=ptr.next) 
		{
			result = result +  ptr.element.toString();     
			if (ptr.next != null)
				result = result + "\n"; 
		}
		return result;
	}
   
}

