//8. Write a Java program to test if a map contains a mapping for the specified value.
package Maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap8 {
	
	public static void main(String [] args) {
		
		Map<Integer, String> hm8 = new HashMap<Integer, String>();
		hm8.put(1, "Anandvalue");
		hm8.put(2, "Somavalue");
		
		// The elements in the map
		System.out.println("The map elemnts are :"+hm8);
		
		for (Map.Entry string11 : hm8.entrySet()) {
			System.out.println(string11.getKey() +"--"+string11.getValue());
			
		}
		
		if(hm8.containsValue("Anandvalue")) {
			System.out.println("The value is ANANDVALUE is present is the map");
		}
		else {
			System.out.println("The value is ANANDVALUE is not present in the map");
		}
	}

}
