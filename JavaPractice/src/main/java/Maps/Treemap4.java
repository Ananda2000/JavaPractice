//4. Write a Java program to search a value in a Tree Map. Go to the editor

package Maps;

import java.util.Map;
import java.util.TreeMap;

public class Treemap4 {
	
	public static void main(String [] args) {
		Map<Integer, String> tm4 = new TreeMap<Integer, String>();
		tm4.put(500, "value500");tm4.put(600, "value-600"); tm4.put(800, "value-900");
		
		System.out.println("The key and values in map tm4 :-"+tm4);
		
		if(tm4.containsValue("value-600")) {
			System.out.println("It contains the values : value-600");
		}
		else {
			System.out.println("It does not contains the value :- value-600");
		}
	}

}
