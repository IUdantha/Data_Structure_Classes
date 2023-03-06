package Linked_List;

public class LinkList_insertAfter_deleteSpecific_find {
	public Link first; // in insertAfter method this attribute will public

	public LinkList_insertAfter_deleteSpecific_find() {
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

	// insertAfter method
	public void insertAfter(Link prevLink, int id) {
		// Check if the given Node is null
		if (prevLink == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		// Allocate the Node & Put in the data
		Link newLink = new Link(id);

		// Make next of new Node as next of prevLink
		newLink.next = prevLink.next;

		// make next of prev_node as new_node
		prevLink.next = newLink;
	}

	// deleteAfter method
	public void deleteSpecific(Link delLink) {
		if (delLink == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Link current = first;
		while (current.next != delLink) {
			current = current.next;
		}
		current.next = current.next.next;
	}

	// find method
	public boolean find(int id) {
		Link current = first;
		while (current.next != null) {
			if(current.iData == id) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

}
