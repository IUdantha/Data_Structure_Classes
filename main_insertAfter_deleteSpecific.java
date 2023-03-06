package Linked_List;

public class main_insertAfter_deleteSpecific {

	public static void main(String[] args) {

		LinkList_insertAfter_deleteSpecific_find theList1 = new LinkList_insertAfter_deleteSpecific_find();
		theList1.insertLast(1);
		theList1.insertLast(2);
		theList1.insertLast(3);
		theList1.insertLast(4);

		// insert a new Link after the third element
		Link current = theList1.first;
		for (int i = 1; i < 3 && current != null; i++) {
			current = current.next;
		}
		if (current != null) {
			theList1.insertAfter(current, 5);
		}

		// print the updated linked list
		theList1.displayList();
		// Output: 1 2 3 5 4

		// deletion specific method
		Link current2 = theList1.first;
		for (int i = 1; i < 3 && current2 != null; i++) {
			current2 = current2.next;
		}
		if (current2 != null) {
			theList1.deleteSpecific(current2);
		}

		// print the updated linked list
		theList1.displayList();
		// Output: 1 2 3 5 4

	}

}
