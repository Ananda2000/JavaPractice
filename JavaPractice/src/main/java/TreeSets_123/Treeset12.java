/*12. Write a Java program to get the element in a tree set which is strictly greater
 *  than or equal to the given element. Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset12 {
	public static void main (String [] args) {
		TreeSet<Integer> ts12 = new TreeSet<Integer>();
		ts12.add(34);
		ts12.add(8);
		ts12.add(89);
		ts12.add(77);
		
		System.out.println(ts12);
		
		System.out.println(ts12.higher(30));
		
	}

}
