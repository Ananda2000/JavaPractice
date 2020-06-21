/*
19. Write a Java program to trim the capacity of an array list the current list size. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;

public class Arraylist19 {
	
	public static void main(String [] args) {
		ArrayList<String> al18 = new ArrayList<String>();
		
		al18.add("One19");
		al18.add("Two19");
		
		System.out.println("The arraylist size before trim :-"+al18.size());
		al18.trimToSize();
		System.out.println("The arraylist size after trim :-"+al18.size());
	}

}
