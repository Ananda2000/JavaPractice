/*14. Write a Java program to remove all the elements from a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlist13 {
	public static void main (String [] args) {
		LinkedList<String> ll14 = new LinkedList<String>();
		
		ll14.add("1-ll14");
		ll14.add("2-ll14");
		ll14.add("3-ll14");
		System.out.println("The elements in list :-"+ll14);
		
		ll14.removeAll(ll14);
		System.out.println("Elements after remove :-"+ll14);
		}

}
