/*13. Write a Java program to get an element in a tree set which is strictly less than the given element. Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset13 {

	public static void main(String [] args) {
		TreeSet<Integer> ts13 = new TreeSet<Integer>();
		ts13.add(67);
		ts13.add(78);
		ts13.add(99);
		ts13.add(88);
		
		System.out.println(ts13);
		
		System.out.println(ts13.lower(80));
	}
}
