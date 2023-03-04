package Queues;

public class circularQueue {
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	private char[] qArr;

	// constructor
	public circularQueue(int S) {
		front = 0;
		rear = -1;
		nItems = 0;
		maxSize = S;
		qArr = new char[maxSize];
	}

	// pushing
	public void push(char value) {
		if (isFull()) {
			System.out.println("The Queue is full.");
		} else {
			if (rear == maxSize - 1) {
				rear = -1;
			}
			nItems++;
			qArr[++rear] = value;

		}
	}

	// poping
	public char pop() {
		if (isEmpty()) {
			System.out.println("The Queue is empty.");
			return 'Z';
		} else {
			if (front == maxSize) {
				front = 0;
			}
			nItems--;
			return qArr[front++];
		}
	}

	// peeking
	public char peek() {
		if (isEmpty()) {
			System.out.println("The Queue is empty.");
			return 'Z';
		} else {
			if (front == maxSize) {
				front = 0;
			}
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
