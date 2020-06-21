//Write a Java program to get a reverse order view of the keys contained in a given map.


package Maps;

import java.util.Map;
import java.util.TreeMap;

public class Treemap10 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm10 = new TreeMap<Integer, String>();
		tm10.put(4, "tm10-value");
		tm10.put(6, "tm10-value");
		tm10.put(55, "tm10-value55");
		
		System.out.println("The key elemnts are : ");
		for (Map.Entry string10 : tm10.entrySet()) {
			System.out.println(string10.getKey()+"-"+string10.getValue());
		}
		System.out.println(tm10.descendingKeySet());
	}
}
