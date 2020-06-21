//9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map. Go to the editor
//Click me to see the solution

package Maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap9 {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm9 = new TreeMap<Integer, String>();
		tm9.put(100,"tm9-value");
		tm9.put(6, "tm9-value");
		tm9.put(88, "tm9-value");
		tm9.put(-6, "tm9-value");
		
		System.out.println("The collection list are :"+tm9);
		
		for (Map.Entry string12 : tm9.entrySet()) {
			System.out.println(string12.getKey() +"-"+string12.getValue());
			
		}
		
		System.out.println("The lowest Key is:-"+tm9.firstKey());
		
		System.out.println("The highest key is:"+tm9.lastKey());
 	
	
	}

}
