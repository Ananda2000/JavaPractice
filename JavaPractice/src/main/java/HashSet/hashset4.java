//4. Write a Java program to empty an hash set.

package HashSet;

import java.util.HashSet;

public class hashset4 {
	public static void main(String [] args) {
		HashSet<String> hs4 = new HashSet<String>();
		hs4.add("srinivaspura");
		hs4.add("Kolar");
		hs4.add("Karnataka");
		hs4.add("India");
		hs4.add("Australia");
	System.out.println("The elemnts of hash set is: "+hs4);
	
	hs4.removeAll(hs4);
	System.out.println("Is the hashset is empty :-"+hs4.isEmpty());
	}

}
