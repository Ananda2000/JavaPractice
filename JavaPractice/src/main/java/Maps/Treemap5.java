//5. Write a Java program to get all keys from the given a Tree Map. Go to the editor

package Maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap5 {
	public static void main(String [] args) {
		
		Map<Integer, String> tm5 = new TreeMap<Integer, String>();
		tm5.put(222, "value222"); tm5.put(223, "value223");tm5.put(221, "value221");
		
		System.out.println("The elements of Tree maps are :-"+tm5);
		
		
			System.out.println("The treemap keys are :"+tm5.keySet());
			Set<Integer> aa = tm5.keySet();
			for (Integer integer : aa) {
				System.out.println(integer);
				
			}
			
		
	}

}
