/*11. Write a Java program to get the element in a tree set which is less than or equal to the given element. Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset11 {
	public static void main (String [] args) {
		TreeSet<Integer> ts11 = new TreeSet<Integer>();
		ts11.add(99);
		ts11.add(47);
		ts11.add(88);
		ts11.add(56);
		System.out.print("The least element then the given element is - ");
		System.out.println(ts11.floor(57));
	}

}
