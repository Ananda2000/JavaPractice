
/*10. Write a Java program to get the first and last occurrence of the specified elements in a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class linkedlist10 {
	public static void main(String[] args) {
		LinkedList<String> ll10 = new LinkedList<String>();
		ll10.add("1-ll9");
		ll10.add("2-ll9");
		ll10.add("3-ll9");
		System.out.println("The first elemnt in the list is:"+ll10.getFirst());
		System.out.println("The last element in the list is: "+ll10.getLast());
	}

}
