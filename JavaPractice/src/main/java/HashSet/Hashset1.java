//1. Write a Java program to append the specified element to the end of a hash set

package HashSet;

import java.util.HashSet;

public class Hashset1 {
	public static void main(String [] args) {
		HashSet<String> hs1 = new HashSet<String> ();
		
		hs1.add("Hashset 1");
		hs1.add("Ananda 2");
		hs1.add("Soma -3");
		hs1.add("Global");
		System.out.println(hs1);
		
		for (String string_hs1 : hs1) {
			System.out.println(string_hs1);
			
		}
	
	}

}
