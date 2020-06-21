//Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive)

package Maps;

import java.util.TreeMap;

public class Treemap21 {
public static void main(String [] args) {
	
	TreeMap<Integer, String> tm21 = new TreeMap<Integer, String>();
	tm21.put(455, "tm21-value 455");
	tm21.put(456, "tm21-value456");
	tm21.put(999, "tm21-value999");
	tm21.put(777, "tm21value777");
	
	System.out.println("The tree elements are :"+tm21);
	
	System.out.println(tm21.subMap(456, 999));
	System.out.println(tm21);
}
}
