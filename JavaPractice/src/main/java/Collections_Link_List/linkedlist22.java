
/*22. Write a Java program to check if a particular element exists in a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlist22 {
	
	public static void main(String[] args) {
		LinkedList<String> ll22 = new LinkedList<String>();
		
		ll22.add("one");
		ll22.add("Two");
		
		if(ll22.contains("one")) {
			System.out.println("contains the element in the list");
		}
		else {
			System.out.println("The list does not contains the element");
		}
	}

}
