/*14. Write a Java program to retrieve and remove the first element of a tree set. 
 * Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset14 {
	public static void main(String [] args) {
		TreeSet<Integer> ts14 = new TreeSet<Integer>();
		ts14.add(89);
		ts14.add(77);
		ts14.add(66);
		ts14.add(99);
		ts14.add(44);
		
		System.out.println(ts14);
		System.out.println(ts14.pollFirst());
		System.out.println(ts14);
	}

}
