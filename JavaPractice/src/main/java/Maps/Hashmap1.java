//Write a Java program to associate the specified value with the specified key in a HashMap.
package Maps;

import java.util.HashMap;
import java.util.Map;


public class Hashmap1 {
	public static void main(String [] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(1, "Red");
		hm1.put(2, "Blue");
		hm1.put(3, "Green");
		hm1.put(5, "Blue");
		
		System.out.println("The key and values in map: "+hm1);
		for(Map.Entry a:hm1.entrySet()) {
			System.out.println(a.getKey() + " : "+a.getValue());
		}
		
		
	}

}
