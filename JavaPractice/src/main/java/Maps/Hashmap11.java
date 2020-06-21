//11. Write a Java program to get a set view of the keys contained in this map. Go to the editor

package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap11 {
	public static void main(String [] args) {
		Map<Integer, String> hm11 = new HashMap<Integer, String>();
		hm11.put(1, "Lock"); 
		hm11.put(2, "key");
		hm11.put(3, "valid");
		hm11.put(5, "picture");
		
		System.out.println("The collection elements are :"+hm11);
		
		Set<Integer> sethm11 = hm11.keySet();
		 
		System.out.println("The hashmap key elements are :" + sethm11);
	}

}
