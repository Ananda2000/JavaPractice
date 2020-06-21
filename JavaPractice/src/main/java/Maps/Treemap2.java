//2. Write a Java program to copy a Tree Map content to another Tree Map. Go to the editor

package Maps;

import java.util.Map;
import java.util.TreeMap;

public class Treemap2 {
public static void main(String [] args) {
	Map<Integer, String> tm2 = new TreeMap<Integer, String>();
	tm2.put(5, "Audi"); tm2.put(99, "volvo"); tm2.put(7, "toyota");
	System.out.println("The tree elements are :"+tm2);
	
	TreeMap<Integer, String> cpytm2 = new TreeMap<Integer, String>();
	cpytm2.putAll(tm2);
	
	System.out.println("The result after copying :-"+ cpytm2);
	
	// Display of elements in key, value pair
	for (Map.Entry disp: cpytm2.entrySet()) {
		System.out.println(disp.getKey() +" : "+disp.getValue());
		
	}
	
}
	
}
