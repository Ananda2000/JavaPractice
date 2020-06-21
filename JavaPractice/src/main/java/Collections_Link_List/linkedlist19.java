
/*19. Write a Java program to remove and return the first element of a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class linkedlist19 {
	
	public static void main(String[] args) {
		LinkedList<String> ll19 = new LinkedList<String>();
		
		ll19.add("1-ll19");
		ll19.add("2-ll19");
		ll19.add("3-ll19");
		ll19.add("4-ll19");
		
		System.out.println("the linked list elements are:" +ll19);
		System.out.println("display and remove the 1st element from list:"+ll19.pop());
		System.out.println("The list elements after removing"+ll19);
	}

}
