package Queues;

public class mainLinearQueue {

	public static void main(String[] args) {
		linearQueue lq = new linearQueue(3);
		
		lq.push('a');
		lq.push('b');
		lq.push('c');
		lq.push('d'); // not push, the queue is full.
		
		System.out.println(lq.peek());
		
		while(!lq.isEmpty()) {
			lq.pop();
		}
		
		System.out.println(lq.peek());
		
		lq.push('d'); // show queue is full, cuz linear queue

	}

}
