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

	// deleteFirst Method
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

}
