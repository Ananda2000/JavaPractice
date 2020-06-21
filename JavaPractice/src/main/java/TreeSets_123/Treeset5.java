/*5. Write a Java program to get the first and last elements in a tree set. Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset5 {

	public static void main(String[] args) {
		TreeSet<String> ts5 = new TreeSet<String>();
		ts5.add("three");
		ts5.add("zero");
		ts5.add("billion");
		
		System.out.println(ts5);
		System.out.println("The fisrt element -"+ts5.first());
		System.out.println("The last element -"+ts5.last());
	}
}
