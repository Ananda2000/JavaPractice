//26. Write a Java program to replace an element in a linked list. 

package Collections_Link_List;

import java.util.LinkedList;

public class Linkedlist26 {
public static void main(String[] args) {
	LinkedList<String> ll26 = new LinkedList<String>();
	
	ll26.add("1-123");
	ll26.add("5-123");
	ll26.add("3-123");
	ll26.add("6-123");
	
	System.out.println(ll26);
	
	ll26.set(1, "2-123element");
	
	System.out.println(ll26);
}
}
