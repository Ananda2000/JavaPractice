//25. Write a Java program to test an linked list is empty or not

package Collections_Link_List;

import java.util.LinkedList;

public class Linkedlist25 {
	
	public static void main(String [] args) {
		LinkedList<String> ll25 = new LinkedList<String>();
		ll25.add("Ananda");
		ll25.add("Giri");
		ll25.add("Babu");
		ll25.add("soma");
		System.out.println(ll25);
		
		for (String string1 : ll25) {
			System.out.println(string1);
			
		}
		System.out.println("Is the linked list is empty -"+ll25.isEmpty());
	}

}
