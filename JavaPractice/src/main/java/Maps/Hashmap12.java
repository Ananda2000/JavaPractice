//12. Write a Java program to get a collection view of the values contained in this map.

package Maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap12 {
	public static void main(String [] args) {
		Map<Integer, String> hm12 = new HashMap<Integer, String>();
		hm12.put(11, "value11");
		hm12.put(21, "value21");
		hm12.put(31, "value31");
		
		System.out.println("the values of map in collection formw"+hm12.values());
		
	}

}
