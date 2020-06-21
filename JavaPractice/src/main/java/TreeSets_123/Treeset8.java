/*8. Write a Java program to compare two tree sets. Go to the editor
Click me to see the solution
*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset8 {
	public static void main(String [] args) {
		TreeSet<String> ts8 =new TreeSet<String>();
		ts8.add("ts81");
		ts8.add("ts82");
		ts8.add("ts83");
		
		TreeSet<Integer> ts8_comp = new TreeSet<Integer>();
		 
		for (String integer1 : ts8) {
			System.out.print(integer1 +" - ");
			System.out.println(ts8_comp.contains(integer1)? "Yes" : "No");
			
		}
	}

}
