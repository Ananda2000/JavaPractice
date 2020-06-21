//Write a Java program to remove and get a key-value mapping associated with the least key in a map

package Maps;

import java.util.TreeMap;

public class Treemap19 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm19 = new TreeMap<Integer, String>();
		tm19.put(567, "tm19-value1");
		tm19.put(435, "tm19-value435");
		tm19.put(890, "tm19-value890");
		tm19.put(533, "tm19-value533");
		
		System.out.println("The elemnts in map:"+tm19);
		System.out.println(tm19.pollFirstEntry());
		
		System.out.println("The elemnts in map:"+tm19);
	}

}
