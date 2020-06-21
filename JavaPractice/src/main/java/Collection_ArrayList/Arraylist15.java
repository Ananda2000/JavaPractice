/*15. Write a Java program to join two array lists. Go to the editor
Click me to see the solution
*/package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist15 {
	public static void main(String [] args) {
		
	ArrayList<String> al15 = new ArrayList<String>();
	ArrayList<String> al15a = new ArrayList<String>();
	
	al15.add("One");
	al15.add("Two");
	al15.add("Three");
	System.out.println("The content of 1st array is :-"+al15);
	
	al15a.add("Four");
	System.out.println("The contents of al15a arraylist :-"+al15a);
	
	al15.addAll(al15a);
	
	System.out.println(al15);
	}

}
