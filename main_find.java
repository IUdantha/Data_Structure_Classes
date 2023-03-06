package Linked_List;

public class main_find {

	public static void main(String[] args) {
		LinkList_insertAfter_deleteSpecific_find theList1 = new LinkList_insertAfter_deleteSpecific_find(); // create a new List

		theList1.insertLast(4543); // insert four items using insert last method
		theList1.insertLast(56);
		theList1.insertLast(678);
		theList1.insertLast(12); // output = 4543,56,678,12

		theList1.displayList();

		if (theList1.find(4543)) {
			System.out.println("The link is there");
		} else {
			System.out.println("The link is not there");
		}
	}
}
