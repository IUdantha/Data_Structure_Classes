package Linked_List;

public class LinkList {
	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null); // true if list is empty
	}

	public void displayList() {
		if (isEmpty()) {
			System.out.println("The linked List is empty.");
			return;
		}
		Link current = first;
		while (current != null) {
			current.DisplayLink();
			current = current.next;
		}
		System.out.println(" ");
	}

	// insertFirst Method
	public void insertFirst(int id) {
		Link newLink = new Link(id);
		newLink.next = first;
		first = newLink;
	}

	// insertLast Method
	public void insertLast(int id) {
		// Create a new Link
		Link newLink = new Link(id);

		// If the Linked List is empty, then make the new link as first
		if (isEmpty()) {
			first = newLink;
			return;
		}

		// This new link is going to be the last link, so make next of it as null
		newLink.next = null;

		// Else traverse till the last Link
		Link current = first;
		while (current.next != null) {
			current = current.next;
		}

		current.next = newLink;

	}

	// deleteFirst Method
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	// deleteLast method
	public Link deleteLast() {
		Link temp = new Link(0000000);
		if (isEmpty()) {
			System.out.println("The linked List is empty.");
			return temp;
		}
		Link current = first;

		while (current.next.next != null) {
			current = current.next;
		}
		temp = current.next.next;
		current.next = null;
		return temp;
	}

}
