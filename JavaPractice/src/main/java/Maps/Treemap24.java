//24. Write a Java program to get a portion of a map whose keys are greater than to a given key

package Maps;

import java.util.TreeMap;

public class Treemap24 {

	public static void main(String [] args) {
		TreeMap<Integer, String> tm24 = new TreeMap<Integer, String>();
		
		tm24.put(56, "tm24-value56");
		tm24.put(881, "tm24value881");
		tm24.put(234, "tm24value 234");
		tm24.put(723, "tm24value723");
		
		System.out.println(tm24.tailMap(56, false));
	}
}
