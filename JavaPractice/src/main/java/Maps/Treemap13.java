//Write a Java program to get the portion of a map whose keys are strictly less than a given key.

package Maps;

import java.util.TreeMap;

public class Treemap13 {
	
	public static void main(String [] args) {
		
		TreeMap<Integer, String> tm13= new TreeMap<Integer, String>();
		tm13.put(59, "tm13-value-59");
		tm13.put(78, "tm13-value-78");
		tm13.put(580, "tm13-value-580");
		
		
		System.out.println("The map elements are :- "+tm13);
		
		System.out.println("The key element 80");
		System.out.println(tm13.headMap(80));
		
		System.out.println("The key element 60");
		System.out.println(tm13.headMap(60));
	}

}
