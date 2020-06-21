//https://www.javatpoint.com/java-string-faqs
//20) Java Program to find duplicate characters in a String..

package StringMethodsExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D20uplicateCharecters {
	public static void main(String[] args) {
		
		String aa="This is string";
		char[] ch11 = aa.toCharArray();
		Map<Character, Integer> mapss = new HashMap<Character, Integer>();
		
		for (char c : ch11) {
			if(mapss.containsKey(c)) {
				mapss.put(c, mapss.get(c)+1);
			}
			else {
				mapss.put(c, 1);
			}
			
		}
		Set<Character> cc = mapss.keySet();
		for (Character character : cc) {
			if(mapss.get(cc)>1) {
				System.out.println(cc +":"+mapss.get(cc));
			}
			/*
			 * else { System.out.println(mapss.get(cc)); }
			 */
			
		}
		
	}

}
