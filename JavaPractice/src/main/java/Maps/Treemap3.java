//3. Write a Java program to search a key in a Tree Map. Go to the editor

package Maps;

import java.util.Map;
import java.util.TreeMap;

public class Treemap3 {
	public static void main(String [] args) {
		Map<Integer, String> tm3 = new TreeMap<Integer, String>();
		tm3.put(100, "value100"); tm3.put(101, "value101"); tm3.put(55, "value55");
		System.out.println("The display of tree elements are");
		
		int kes = 55;
		
			if(tm3.containsKey(kes)) {
				System.out.println("The map contains the key :"+ kes);
			}
			else {
				System.out.println("The system does not contain the keys");
			}
		}
	

}
