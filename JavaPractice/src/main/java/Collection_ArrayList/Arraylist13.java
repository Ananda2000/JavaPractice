/*13. Write a Java program to compare two array lists. Go to the editor*/

package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist13 {

	public static void main (String [] args) {
		ArrayList<String> al13 = new ArrayList<String>();
		ArrayList<String> al13a = new ArrayList<String>();
		al13.add("Good");
		al13.add("Bad");
		
		al13a.add("Good");
		al13a.add("Bad");
		ArrayList<String> c3 = new ArrayList<String>();
		//System.out.println(al13.contains(al13a));
		for (String string1 : al13a) {
			c3.add(al13a.contains(string1)? "yes":"No");
			System.out.println(c3);
		}
		
		
	}
}
