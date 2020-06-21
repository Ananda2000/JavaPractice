//Write a Java program to remove all of the mappings from a map
package Maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap4 {
public static void main(String [] args) {
	Map<Integer, String> hm4 = new HashMap<Integer, String>();
	hm4.put(1, "kumar");
	hm4.put(2, "reddy");
	hm4.put(5, "java");
	hm4.put(6, "programming");
	
	System.out.println("The map elements are:"+hm4);
	System.out.println("The map is empty: -"+hm4.isEmpty());
	
	
	
	System.out.println("display elements as key and value pair");
	for(Map.Entry mm:hm4.entrySet())
	{
		System.out.println(mm.getKey()+" : "+mm.getValue());
	}
	// to remove all the elements from map
	
	System.out.println("Remove all the elements form map");
	hm4.clear();
	System.out.println("The map elements are is empty:"+hm4.isEmpty());
	
	
}
}
