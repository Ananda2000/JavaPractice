//6. Write a Java program to delete all elements from a given Tree Map. Go to the editor

package Maps;

import java.util.Map;
import java.util.TreeMap;

public class Treemap6 {
public static void main(String [] args) {
	Map<Integer, String> tm6 = new TreeMap<Integer, String>();
	tm6.put(224, "value_224");tm6.put(225, "value_225");tm6.put(226, "value_226");
	System.out.println("The map elements before delete :"+tm6);
	
	// remove the elements from MAP
	tm6.clear();
	
	System.out.println("is the map empty :"+tm6.isEmpty());
}
}
