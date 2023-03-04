package stackImplementation;

public class myStackMain {

	public static void main(String[] args) {
		// creation
		stackClass myStack = new stackClass(4);

		// pushing
		System.out.println("This is pushing");
		myStack.push('a');
		myStack.push('b');
		myStack.push('c');
		myStack.push('d');
		myStack.push('e'); // this will not added to the stack

		// peeking
		System.out.println("\n\nThis is peeking");
		System.out.println(myStack.peek()); // just watch outer element

		// poping
		System.out.println("\n\nThis is poping");
		System.out.println("'" + myStack.pop() + " ' was removed");// just remove the last element

		// remove all from stack with dispying
		System.out.println("\n\nRemove all the remaining elements");
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}

	}

}
