
/*4. Write a Java program to iterate a linked list in reverse order. Go to the editor
Click me to see the solution
*/

package Collections_Link_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist4 {
public static void main(String[] args) {
	LinkedList<String> ll4 = new LinkedList<String>();
	ll4.add("1-ll4");
	ll4.add("2-ll4");
	ll4.add("3-ll4");
	ll4.add("4-ll4");
	ll4.add("5-ll4");
	
	Iterator<String> itr3 = ll4.descendingIterator();
	
	while(itr3.hasNext()) {
		System.out.println(itr3.next());
	}
}
	
}
