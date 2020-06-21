/*9. Write a Java program to insert some elements at the specified position into a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class linkedlist9 {
	public static void main(String [] args) {
		LinkedList<String> ll9 = new LinkedList<String>();
		ll9.add("1-ll9");
		ll9.add("2-ll9");
		ll9.add("3-ll9");
		System.out.println("Elements before insertion:"+ll9);
		ll9.add(1, "Inserting at 1st index");
		System.out.println("Elements after insertion:"+ll9);
		
	}

}
