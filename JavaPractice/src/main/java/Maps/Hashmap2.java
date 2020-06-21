//Write a Java program to count the number of key-value (size) mappings in a map
package Maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {
	public static void main(String [] args) {
		Map<String, String> hm2 = new HashMap<String, String>();
		System.out.println(hm2.size());
		hm2.put("color-1", "Red");
		hm2.put("color-2", "Green");
		hm2.put("color-3", "Blue");
		
		System.out.println("The size of map :"+hm2.size());
	}

}
