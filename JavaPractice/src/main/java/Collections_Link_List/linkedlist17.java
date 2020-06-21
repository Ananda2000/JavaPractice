
/*17. Write a Java program to join two linked lists. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class linkedlist17 {
	public static void main(String [] args) {
		LinkedList<String> ll17 = new LinkedList<String>();
		
		ll17.add("1-ll17");
		ll17.add("2-ll17");
		
		LinkedList<String> ll17a = new LinkedList<String>();
		ll17a.add("3-ll17");
		ll17a.add("4-ll17");
		
		ll17.addAll(ll17a);
		System.out.println("The elements after joining:-"+ll17);
	}

}
