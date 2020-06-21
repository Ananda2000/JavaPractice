// 22. Write a Java program to get the portion of a map whose keys range from a given key to another key.

package Maps;

import java.util.TreeMap;

public class Treemap22 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm22 = new TreeMap<Integer, String>();
	tm22.put(455, "tm22-value 455");
	tm22.put(456, "tm22-value456");
	tm22.put(999, "tm22-value999");
	tm22.put(777, "tm22value777");
	
	System.out.println(tm22.subMap(456, true, 777, true));
	
	
}
}
