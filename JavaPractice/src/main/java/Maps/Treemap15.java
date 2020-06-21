//Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key

package Maps;

import java.util.Map;
import java.util.TreeMap;

public class Treemap15 {
	
	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> tm15 = new TreeMap<Integer, String>();
		tm15.put(61, "tm15-value61");
		tm15.put(62, "tm15-value62");
		tm15.put(63, "tm15-value63");
		tm15.put(64, "tm15-value64");
		
		System.out.println("the key elements are:"+tm15);
		
		for (Map.Entry string15 : tm15.entrySet()) {
			System.out.println(string15.getKey()+"-"+string15.getValue());
		}
		
		System.out.println(tm15.higherKey(63));
		System.out.println(tm15.higherEntry(64));
		
		
	}

}
