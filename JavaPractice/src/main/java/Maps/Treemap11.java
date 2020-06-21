//Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.

package Maps;

import java.util.TreeMap;

public class Treemap11 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm11 = new TreeMap<Integer, String>();
		tm11.put(44,"tm11-value44");
		tm11.put(66, "tm11-value66");
		tm11.put(33, "tm11-value33");
		
		System.out.println(tm11);
		System.out.println("It is same as tm8 Treemap8 class");
	
	}
	
}
