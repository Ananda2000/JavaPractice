//17 Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.

package Maps;

import java.util.TreeMap;

public class Treemap17 {

	public static void main(String [] args) {
		TreeMap<Integer, String> tm17 = new TreeMap<Integer, String>();
		tm17.put(68, "tm17-value68");
		tm17.put(69, "tm17-value 69");
		tm17.put(70, "tm17-value 70");
		
		
		System.out.println("The list of elements:- "+tm17);
		
		System.out.println("The elments :- "+tm17.lowerEntry(69));
		System.out.println("The elements :-"+tm17.lowerKey(69));
		
	}
}
