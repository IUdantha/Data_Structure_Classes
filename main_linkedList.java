package Linked_List;

public class main_linkedList {

	public static void main(String[] args) {
		LinkList theList = new LinkList(); // create a new List

		theList.insertFirst(23); // insert four items
		theList.insertFirst(445);
		theList.insertFirst(253);
		theList.insertFirst(67);

		theList.displayList(); // display the List

		while (!theList.isEmpty()) { // delete item one by one
			Link aLink = theList.deleteFirst();
			System.out.println("Deleted");
			aLink.DisplayLink();

		}

	}

}
