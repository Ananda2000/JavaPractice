//Write a Java program to create a set view of the mappings contained in a map

package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap9 {
	public static void main(String [] args) {
		Map<Integer, String> hm9 = new HashMap<Integer, String>();
		hm9.put(1, "Delete");
		hm9.put(2, "insert");
		hm9.put(3, "Clear");
		
		System.out.println("The elements from the list are :"+hm9);
		for (Map.Entry string : hm9.entrySet()) {
			System.out.println(string);
			
		}
		
		Set set = hm9.entrySet();
		System.out.println("The elment display from set view :"+set);
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
	}

}


