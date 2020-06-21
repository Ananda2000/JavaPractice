/*3. Write a Java program to iterate through all elements in a linked list starting at the specified position. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist3 {

	public static void main (String[] args) {
		LinkedList<String> ll3 = new LinkedList<String>();
		ll3.add("1-ll3");
		ll3.add("2-ll3");
		ll3.add("3-ll3");
		
		Iterator<String> itr2 = ll3.listIterator(1);
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
