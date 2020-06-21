//Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map

package Maps;

import java.util.Arrays;
import java.util.TreeMap;

public class Treemap8 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm8 = new TreeMap<Integer, String>();
		
		tm8.put(5, "tm8-value");
		tm8.put(9, "tm8-value");
		tm8.put(12, "tm8-value");
		
		
		System.out.println("The size of treemap is:"+tm8);
		
			System.out.println("check the floor entry for 8----");
			System.out.println("Value is:- "+tm8.floorEntry(8));
			
			System.out.println("check the floor entry for 11----");
			System.out.println("Value is:- "+tm8.floorEntry(11));
			
		
	}
}
