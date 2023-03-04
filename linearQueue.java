package Queues;

public class linearQueue {
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	private char[] qArr;

	// constructor
	public linearQueue(int S) {
		front = 0;
		rear = -1;
		nItems = 0;
		maxSize = S;
		qArr = new char[maxSize];
	}

	// pushing
	public void push(char value) {
		if (rear == maxSize - 1) {
			System.out.println("The Queue is full.");
		} else {
			nItems++;
			qArr[++rear] = value;
		}
	}

	// poping
	public char pop() {
		if (nItems == 0) {
			System.out.println("The Queue is empty.");
			return 'Z';
		} else {
			nItems--;
			return qArr[front++];
		}
	}

	// peeking
	public char peek() {
		if (nItems == 0) {
			System.out.println("The Queue is empty.");
			return 'Z';
		} else {
			return qArr[front];
		}
	}

	// isEmpty
	public boolean isEmpty() {
		return nItems == 0;
	}

	// isFull
	public boolean isFull() {
		return nItems == maxSize;
	}

}
