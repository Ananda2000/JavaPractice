/*2. Write a Java program to iterate through all elements in a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist2 {
	
	public static void main (String[] args) {
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("one1-ll2");
		ll2.add("Two2-ll2");
		ll2.add("3ll2");
		
		Iterator<String> itr = ll2.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
