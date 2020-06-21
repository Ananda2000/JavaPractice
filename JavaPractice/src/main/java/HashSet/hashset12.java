//Write a Java program to remove all of the elements from a hash set.

package HashSet;

import java.util.HashSet;

public class hashset12 {
	public static void main(String [] args) {
		HashSet<String> hs12 = new HashSet<String>();
		hs12.add("remove1");
		hs12.add("remove2");
		hs12.add("remove3");
		
		System.out.println("The elements of hash set");
		for (String stringremo : hs12) {
			System.out.println(stringremo);
		
		}
		hs12.removeAll(hs12);
		System.out.println("is the hs12 collection is empty :-"+hs12.isEmpty());
	}
}
