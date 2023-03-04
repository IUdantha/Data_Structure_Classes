package stackImplementation;

public class stackClass {
	private int top;
	private int maxSize;
	private char stackArr[];
	
	//constuctor
	public stackClass(int S) {

		top = -1;
		maxSize = S;
		stackArr = new char[maxSize];
	}

	//pushing method
	public void push(char value) {
		if(top == maxSize - 1) {
			System.out.println("Cannot push char value '" + value + "'");
		}
		else {
			 stackArr[++top] = value;
		}
	}
	
	//poping method
	public char pop() {
		if(top == -1) {
			System.out.println("The stack is empty");
			return (char) -99;
		}
		else {
			return stackArr[top--];
		}
		
		
	}
	
	//peeking method
	public char peek() {
		return stackArr[top];
		
	}
	
	//isEmpty method
	public boolean isEmpty() {
//		if(top == -1)
//			return true;
//		else
//			return false;
		
		return (top == -1);
	}
	

}
