/*10. Write a Java program to get the element in a tree set which is greater than or equal to the given element. Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset10 {
	public static void main(String [] args) {
		TreeSet<Integer> ts10 = new TreeSet<Integer>();
		//TreeSet<Integer> ts10_head = new TreeSet<Integer>();
		ts10.add(4);
		ts10.add(55);
		ts10.add(88);
		ts10.add(44);
		ts10.add(7);
		
		System.out.println(ts10.ceiling(43));
		System.out.println(ts10.ceiling(45));
	}

}
