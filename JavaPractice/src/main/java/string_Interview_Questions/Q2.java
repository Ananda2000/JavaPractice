// write a java program to print the duplicate characters in a string using maps or collections.

package string_Interview_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Maps.hashmap9;

public class Q2 {

	
	public static void main(String[] args) {
		String s1 ="Java";
		System.out.println(s1);
		System.out.println("------------------");
		char[] c1= s1.toCharArray();
		//System.out.println(c1);
		
		Map<Character, Integer> map1 = new HashMap<Character,Integer>();
		//int i=0;
		for (char c : c1) {
			if(map1.containsKey(c)) {
				map1.put(c, map1.get(c)+1);
			}
			else {
				map1.put(c, 1);
			}
			
		}
		Set<Character> keys = map1.keySet();
		for (char c : keys) {
			if(map1.get(c)>1) {
				System.out.println(c +"  is repleated - "+map1.get(c));
				
			}
			
		}
		
		System.out.println(map1);
		
		
	}
}
