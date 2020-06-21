//Write a Java program to remove and get a key-value mapping associated with the greatest key in this map

package Maps;

import java.util.TreeMap;

public class Treemap20 {
	
	public static void main(String [] args) {
		TreeMap<Integer, String> tm20 = new TreeMap<Integer, String>();
		tm20.put(567, "tm19-value1");
		tm20.put(435, "tm19-value435");
		tm20.put(890, "tm19-value890");
		tm20.put(533, "tm19-value533");
		
		System.out.println(tm20);
		tm20.pollLastEntry();
		
		System.out.println(tm20);
	}

}
