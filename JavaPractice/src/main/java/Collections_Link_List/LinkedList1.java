/*1. Write a Java program to append the specified element to the end of a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String [] args) {
		LinkedList<String> ll1 = new LinkedList<String>();
		
		ll1.add("Onell1");
		ll1.add("Towll2");
		ll1.addLast("use of Add last method");
		ll1.addFirst("AddFirst use");
		
		System.out.println("The linked list elements are :- "+ ll1);
	}

}
