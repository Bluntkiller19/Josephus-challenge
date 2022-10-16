public class Test
{
	public static void main(String[] args)
	{
		StackAsMyLinkedList<Character> EmptyStack = new StackAsMyLinkedList<Character>();
		StackAsMyLinkedList<Integer> IntStack = new StackAsMyLinkedList<Integer>();
		StackAsMyLinkedList<String> StrStack = new StackAsMyLinkedList<String>();
		StackAsMyLinkedList<Character> CharStack = new StackAsMyLinkedList<Character>();
		StackAsMyLinkedList<prisoner> TestStack = new StackAsMyLinkedList<prisoner>();
		
		//Test data for variable type Integer!
		IntStack.push(new Integer(1));
		IntStack.push(new Integer(2));
		IntStack.push(new Integer(3));
		
		//Test data for variable type String!
		StrStack.push(new String("4. koos"));
		StrStack.push(new String("3. piet"));
		StrStack.push(new String("2. jan"));
		StrStack.push(new String("1. sannie"));
		
		//Test data for variable type Character!
		CharStack.push(new Character('a'));
		CharStack.push(new Character('b'));
		CharStack.push(new Character('c'));
		
		////Test data for my test class prisoner!
		TestStack.push(new prisoner(4,"koos","roos"));
		TestStack.push(new prisoner(2,"Piet","pompies"));
		TestStack.push(new prisoner(5,"jan","tuisbly"));
		TestStack.push(new prisoner(99,"pieter","boos"));
		TestStack.push(new prisoner(189,"Janco","hoog"));

		
		/*
			The Josephus problem is as follow X number of prisoners stands in a sircle waiting to be executed by te person next to them, except one person 
			will survive. So my method will calculate witch prisoner in the group stands in the surviving position!
		*/
		System.out.println("The Josepuhs problem!");
		System.out.println("-------------------------------------");
		
		//The test with empty list
		System.out.println("\nEmpty list:");
		System.out.println("-------------------------------------");
		System.out.println(EmptyStack);
		System.out.println(EmptyStack.josephus());
		
		//Test with one item:
		
		EmptyStack.push(new Character('a'));
		
		System.out.println("\nList with one valaue");
		System.out.println("-------------------------------------");
		System.out.println(EmptyStack);
		System.out.println(EmptyStack.josephus());
		
		
		//The test with Integer valaues
		System.out.println("\nInteger:");
		System.out.println("-------------------------------------");
		System.out.println(IntStack);
		System.out.println(IntStack.josephus());
		
		//The test with String valaues
		System.out.println("\nString:");
		System.out.println("-------------------------------------");
		System.out.println(StrStack);
		System.out.println(StrStack.josephus());
		
		//The test with Character valaue
		System.out.println("\nCharacter:");
		System.out.println("-------------------------------------");
		System.out.println(CharStack);
		System.out.println(CharStack.josephus());
		
		//The test with testclass valaue
		System.out.println("\nTest class prisoner:");
		System.out.println("-------------------------------------");
		System.out.println(TestStack);
		System.out.println(TestStack.josephus());
		
	}
}

