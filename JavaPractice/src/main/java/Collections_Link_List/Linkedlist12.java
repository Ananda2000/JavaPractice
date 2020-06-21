/*12. Write a Java program to remove a specified element from a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class Linkedlist12 {
	public static void main(String [] args) {
		
		LinkedList<String> ll12 = new LinkedList<String>();
		ll12.add("1-ll12");
		ll12.add("2-ll12");
		ll12.add("3-ll12");
		ll12.add("4-ll12");
		System.out.println("The elments in linked list:-"+ll12);
		System.out.println("The size of linked list :-"+ll12.size());
		//here trying to remove 3rd element from list.
		
		ll12.remove(2);
		System.out.println("The elments in linked list after removal:-"+ll12);
		System.out.println("The size of linked list after removal:-"+ll12.size());
		
	}
	

}
