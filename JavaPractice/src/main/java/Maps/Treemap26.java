//Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key

package Maps;

import java.util.TreeMap;

public class Treemap26 {
	public static void main(String [] args) {
		TreeMap<Integer, String> tm26 = new TreeMap<Integer, String>();
		tm26.put(493, "tm25-value493");
		tm26.put(494, "tm25value494");
		tm26.put(495, "tm25-value495");
		tm26.put(496, "tm25value496");
		
		System.out.println(tm26);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println(tm26.ceilingKey(494));
	}

}
