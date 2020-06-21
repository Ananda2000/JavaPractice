//5. Write a Java program to test a hash set is empty or not

package HashSet;

import java.util.HashSet;

public class hashset5 {

	public static void main(String [] args) {
		HashSet<String> hs5 = new HashSet<String>();
		hs5.add("Gold");
		hs5.add("Diamond");
		hs5.add("Platinum");
		hs5.add("copper");
		
		System.out.println("The elements of hashset  :-"+hs5);
		
		// check is the hashset is empty
		System.out.println("Hashset is empty :-"+hs5.isEmpty());
	}
}
