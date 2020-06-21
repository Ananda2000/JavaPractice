//25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. 

package Maps;

import java.util.TreeMap;

public class Treemap25 {
	
	public static void main(String [] args) {
		TreeMap<Integer,String> tm25 = new TreeMap<Integer, String>();
		
		tm25.put(493, "tm25-value493");
		tm25.put(494, "tm25value494");
		tm25.put(495, "tm25-value495");
		tm25.put(496, "tm25value496");
		
		System.out.println(tm25);
		System.out.println("==================================");
		System.out.println(tm25.ceilingEntry(495));
	}

}
