//16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key

package Maps;

import java.util.TreeMap;

public class Treemap16 {
	public static void main (String [] args) {
		
	TreeMap<Integer, String> tm16 = new TreeMap<Integer, String>();
	tm16.put(65, "tm16-value-65");
	tm16.put(66, "tm16-value 66");
	tm16.put(67, "tm16-value-67");
	
	System.out.println("The system elements are:-"+tm16);
	
	
	
	System.out.println(tm16.lowerEntry(66));
	System.out.println(tm16.lowerEntry(65));
	}
	
	
	

}