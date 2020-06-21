package Maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap7 {
	public static void main(String [] args) {
		Map<Integer,String> hm7 = new HashMap<Integer, String>();
		hm7.put(1, "del");
		hm7.put(2, "Microsoft");
		hm7.put(3, "samsung");
		
		System.out.println("The elements of hashmap 7");
		System.out.println(hm7);
		
		for (Map.Entry m: hm7.entrySet()) {
			
		System.out.println(	m.getKey() +" : "+m.getValue());
			
		}
		
		if(hm7.containsKey(1)) {
			System.out.println("The element contains key");
		}
		else {
			System.out.println("It does not contains key");
		}
	}

}
