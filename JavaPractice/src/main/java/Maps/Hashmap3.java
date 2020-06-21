package Maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap3 {
	
	public static void main(String[] args) {
		Map<Integer,String> hm3 = new HashMap<Integer, String>();
		Map<Integer,String> copyhm3 = new HashMap<Integer, String>();
		
		hm3.put(10, "purpule");
		hm3.put(15, "Black");
		hm3.put(11, "gray");
		// Display map data before copy
		System.out.println("dispaly map data before copy");
		System.out.println(" map data of HM3 : "+hm3);
		System.out.println("Map data of copyhm3 :"+copyhm3);
		
		// copying the key and values from hm3 map to copyhm3 map
		copyhm3.putAll(hm3);
		
		System.out.println("Map data of copyhm3 after copy:"+copyhm3);
	}

}
