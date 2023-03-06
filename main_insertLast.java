package Linked_List;

public class main_insertLast {

	public static void main(String[] args) {
		LinkList theList1 = new LinkList(); // create a new List

		theList1.insertLast(4543); // insert four items using insert last method
		theList1.insertLast(56);
		theList1.insertLast(678);
		theList1.insertLast(12); // output = 4543,56,678,12

		theList1.displayList(); // display the List
	}

}
