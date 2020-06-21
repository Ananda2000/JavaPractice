/*7. Write a Java program to get the number of elements in a tree set. Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset7 {
	public static void main(String [] args) {
		TreeSet<String> ts7 = new TreeSet<String>();
		
		ts7.add("element 1");
		ts7.add("element2");
		ts7.add("element3");
		
		System.out.println(ts7);
		
		int size1 = ts7.size();
		System.out.println("The number of elements -"+size1);
	}

}
