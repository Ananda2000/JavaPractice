/*20. Write a Java program to retrieve but does not remove, the first element of a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class linkedlist20 {
	
	public static void main (String [] args) {
		LinkedList<String> ll20 = new LinkedList<String>();
		
		ll20.add("1-ll20");
		ll20.add("2-ll20");
		ll20.add("3-ll20");
		
		//The list of linked list elements
		System.out.println("The list elemnts are :"+ll20);
		
		String a = ll20.getFirst();
		
		System.out.println("The first elemnt in the list is :"+a);
	}

}
