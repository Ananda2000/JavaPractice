//Write a Java program to get the value of a specified key in a map. Go to the editor

package Maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap10 {

	public static void main(String [] args) {
		Map<Integer,String> hm10 = new HashMap<Integer, String>();
		hm10.put(1, "value");
		hm10.put(2, "value1");
		hm10.put(3, "value-3");
		
		String stringvlaue = (String) hm10.get(2);
		System.out.println("The value at specificed index :"+stringvlaue);
		System.out.println("Get the value of key 1 :"+hm10.values());
	}
}
