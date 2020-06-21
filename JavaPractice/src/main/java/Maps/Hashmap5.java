//5. Write a Java program to check whether a map contains key-value mappings (empty) or not. 
package Maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap5 {

	static public void main(String[] args) {
		Map<Integer, String> hm5 = new HashMap<Integer, String>();
		hm5.put(1, "Goa");
		hm5.put(2, "Pandicheri");
		
		System.out.println("is the hm5 maps is empty : "+hm5.isEmpty());
		// clearing the contents of hm5 maps
		System.out.println("Clearing the contents in hm5 map");
		
		hm5.clear();
		System.out.println("is the hm5 map is empty :-"+hm5.isEmpty());
	}
}
