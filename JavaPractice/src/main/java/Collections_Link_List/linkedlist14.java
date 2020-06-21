/*13. Write a Java program to remove first and last element from a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class linkedlist14 {
	public static void main(String [] args) {
		LinkedList<String> ll13 = new LinkedList<String>();
		
		ll13.add("1-ll13");
		ll13.add("2-ll13");
		ll13.add("3-ll13");
		ll13.add("4-ll13");
		ll13.add("5-ll13");
		System.out.println("The linked list of elemnts:-"+ll13);
		
		ll13.removeFirst();
		ll13.removeLast();
		
		System.out.println("The linked list of elemnts after removal:-"+ll13);
		
	}

}
