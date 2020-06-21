/*15. Write a Java program to retrieve and remove the last element of a tree set. Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset15 {
	public static void main (String [] args) {
		TreeSet<Integer> ts15 = new TreeSet<Integer>();
		ts15.add(88);
		ts15.add(66);
		ts15.add(55);
		ts15.add(98);
		ts15.add(66);
		
		System.out.println(ts15);
		
		System.out.println(ts15.pollLast());
		
		System.out.println(ts15);
	}

}
