/*6. Write a Java program to clone a tree set list to another tree set. Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset6 {
	
	public static void main(String [] args) {
		TreeSet<String> ts6 = new TreeSet<String>();
		ts6.add("1TS6");
		ts6.add("2TS6");
		ts6.add("3TS6");
		
		TreeSet<String> ts61 = new TreeSet<String>();
		ts61 = (TreeSet<String>) ts6.clone();
		
		System.out.println("The result at treeset after cloning is :-");
		System.out.println(ts61);
	}

}
