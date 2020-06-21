//2. Write a Java program to iterate through all elements in a hash list.

package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset2 {
	public static void main(String [] args) {
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("has-hs2-1");
		hs2.add("has-hs2-1");
		hs2.add("This is ok");
		hs2.add("Girish");
		
		Iterator<String> itr = hs2.iterator();
			while (itr.hasNext()) {
			System.out.println(itr.next());
				
			}
	}
	
}
