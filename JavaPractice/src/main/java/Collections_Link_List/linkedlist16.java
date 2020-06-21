/*16. Write a Java program to shuffle the elements in a linked list. Go to the editor
Click me to see the solution
*/

package Collections_Link_List;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlist16 {
	public static void main(String [] args) {
		LinkedList<String> ll16 = new LinkedList<String>();
		ll16.add("1-ll16");
		ll16.add("2-ll16");
		ll16.add("3-ll16");
		ll16.add("4-ll16");
		ll16.add("5-ll16");
		ll16.add("6-ll16");
		
		System.out.println("The elements before shuffle:-"+ll16);
		
		Collections.shuffle(ll16);
		System.out.println("The elements after shuffle:-"+ll16);
		
	}

}
