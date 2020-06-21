//Write a Java program to get a portion of a map whose keys are greater than or equal to a given key

package Maps;

import java.util.TreeMap;

public class Treemap23 {
	public static void main(String [] args) {
		TreeMap<Integer, String> tm23 = new TreeMap<Integer, String>();
		
		tm23.put(456, "tm23-value456");
		tm23.put(948, "tm23-value948");
		tm23.put(758, "tm23value758");
		tm23.put(243, "tm23value243");
		
		System.out.println("The elements of tm23 map are:"+tm23);
		
		System.out.println(tm23.tailMap(456));
	}
}
