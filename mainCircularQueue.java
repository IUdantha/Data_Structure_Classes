package Queues;

public class mainCircularQueue {

	public static void main(String[] args) {

		circularQueue cq = new circularQueue(3);

		cq.push('a');
		cq.push('b');
		cq.push('c');
		cq.push('d'); // not push, queue is full.

		System.out.println(cq.pop());

		cq.push('d'); // can push, cuz circular queue

		while (!cq.isEmpty()) {
			System.out.println(cq.pop());
		}

	}

}
