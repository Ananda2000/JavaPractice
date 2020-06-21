/*8. Write a Java program to insert the specified element at the end of a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class Linkedlist8 {
	
	public static void main (String [] args) {
		
		LinkedList<String> ll8 = new LinkedList<String>();
		ll8.add("one-ll8");
		ll8.add("two-ll8");
		
		System.out.println("The linked list elements are :- "+ll8);
		
		ll8.offerLast("insert at last");
		
		System.out.println("Afterinserting the elemnt"+ll8);
	}

}
