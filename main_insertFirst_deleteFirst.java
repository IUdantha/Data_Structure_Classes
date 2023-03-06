package Linked_List;

public class main_insertFirst_deleteFirst {

	public static void main(String[] args) {
		LinkList theList1 = new LinkList(); // create a new List

		theList1.insertFirst(23); // insert four items using insert first method
		theList1.insertFirst(445);
		theList1.insertFirst(253);
		theList1.insertFirst(67); // output = 67,253,445,23

		theList1.displayList(); // display the List

		while (!theList1.isEmpty()) { // delete item one by one
			Link aLink = theList1.deleteFirst();
			System.out.print("Deleted ");
			aLink.DisplayLink();
		}
	}

}
