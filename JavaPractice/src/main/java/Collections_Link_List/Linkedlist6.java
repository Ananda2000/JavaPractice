/*6. Write a Java program to insert elements into the linked list at the first and last position. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class Linkedlist6 {
	public static void main(String [] args) {
		
		LinkedList<String> ll6 = new LinkedList<String>();
		ll6.add("One - ll6");
		ll6.add("Two-ll6");
		System.out.println("The elements are : "+ll6);
		
		ll6.addFirst("Adding at 1st");
		ll6.addLast("Adding elemnt at least");
		
		System.out.println("After adding elements :"+ll6);
	}
	

}
