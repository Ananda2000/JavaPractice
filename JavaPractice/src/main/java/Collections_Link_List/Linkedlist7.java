/*7. Write a Java program to insert the specified element at the front of a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class Linkedlist7 {
	
	public static void main(String[] args) {
		
	

	LinkedList<String> ll7 = new LinkedList<String>();
	ll7.add("one-ll7");
	
	// adding element to the front.
	
	ll7.offerFirst("inserting first");
	
	System.out.println("The elemnts of ll7:"+ll7);
	}

}
