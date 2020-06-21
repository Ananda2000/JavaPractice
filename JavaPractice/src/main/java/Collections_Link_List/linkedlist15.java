/*15. Write a Java program of swap two elements in an linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlist15 {

	public static void main(String [] args) {
		LinkedList<String> ll15 = new LinkedList<String>();
		
		ll15.add("1-ll15");
		ll15.add("2-ll15");
		ll15.add("3-ll15");
		ll15.add("4-ll15");
		ll15.add("5-ll15");
		System.out.println("Elements before swapping:"+ll15);
		
		Collections.swap(ll15, 2, 4);
		System.out.println("Elements after swapping:"+ll15);
		
	}
}
