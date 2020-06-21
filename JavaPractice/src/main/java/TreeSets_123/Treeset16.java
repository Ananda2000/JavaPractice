/*16. Write a Java program to remove a given element from a tree set. Go to the editor
Click me to see the solution
*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset16 {
	public static void main (String [] args) {
		TreeSet<Integer> ts16 = new TreeSet<Integer>();
		ts16.add(99);
		ts16.add(12);
		ts16.add(23);
		ts16.add(77);
		
		System.out.println("The elemnts of treeset are"+ ts16);
		System.out.println(ts16.remove(99));
		System.out.println("elements after remove"+ts16);
	}

}
