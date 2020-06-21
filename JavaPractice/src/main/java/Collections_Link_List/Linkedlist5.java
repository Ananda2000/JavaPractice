
/*5. Write a Java program to insert the specified element at the specified position in the linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class Linkedlist5 {

	public static void main(String [] args) {
		LinkedList<String> ll5 = new LinkedList<String>();
		
		ll5.add("One-ll5");
		ll5.add("Two-ll5");
		
		System.out.println("The arraylist elements are :"+ll5);
		
		ll5.add(1, "2Two-ll5");
		
		System.out.println("After adding the element at middle:"+ll5);
	}
}
