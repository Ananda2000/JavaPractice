//Write a Java program to get the number of elements in a hash set
package HashSet;

import java.util.HashSet;
import java.util.Hashtable;

public class hashset3 {
	
	public static void main (String [] args) {
		HashSet<String> hs3 = new HashSet<String>();
		hs3.add("Goa");
		hs3.add("Mangalore");
		hs3.add("karwar");
		hs3.add("udupi");
		
		System.out.println(hs3);
		System.out.println(hs3.size());
	}

}
