//1. Write a Java program to associate the specified value with the specified key in a Tree Map.

package Maps;

import java.util.Map;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String [] args) {
		Map<Integer, String> tm1 = new TreeMap<Integer, String>();
		tm1.put(1, " Treeemap value1");
		tm1.put(2, "Tree map value2");
		tm1.put(3, "Treee map value 3");
		
		for (Map.Entry string : tm1.entrySet()) {
			System.out.println(string.getKey() +"=>"+string.getValue());
			
		}
	}
}
