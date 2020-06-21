/*4. Write a Java program to create a reverse order view of the elements contained in a given tree set. Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset4 {

	public static void main(String[] args) {
		TreeSet<String> ts4 = new TreeSet<String>();
		ts4.add("Orange");
		ts4.add("Black");
		ts4.add("Yellow");
		ts4.add("pink");
		
		for (String string : ts4) {
			System.out.println(string);
		}
		
		
		Iterator<String> it = ts4.descendingIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
