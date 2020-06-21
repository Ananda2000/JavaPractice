
//3. Write a Java program to add all the elements of a specified tree set to another tree set. Go to the editor
//Click me to see the solution

package TreeSets_123;

import java.util.TreeSet;

public class Treeset3 {

	public static void main(String []args) {
		TreeSet<String> ts3 = new TreeSet<String>();
		ts3.add("One");
		ts3.add("Two");
		ts3.add("Four ts3");
		
		TreeSet<String> ts23 = new TreeSet<String>();
		System.out.println("The elements for treeset ts23"+ts23);
		
		
		ts23.addAll(ts3);
		
		System.out.println("elements after adding to ts23 -"+ts23);
		
		
 	}
}
