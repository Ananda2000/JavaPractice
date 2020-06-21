/*1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set. Go to the editor
Click me to see the solution

2. Write a Java program to iterate through all elements in a tree set. Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.TreeSet;

public class treeset1 {
	public static void main(String [] args) {
		//System.out.println("Hello world");
		
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("Orange");
		ts1.add("blue");
		ts1.add("Pink");
		ts1.add("Yellow");
		System.out.println(ts1);
		
		for (String string1 : ts1) {
			System.out.println(string1);
			
		}
	}

}
