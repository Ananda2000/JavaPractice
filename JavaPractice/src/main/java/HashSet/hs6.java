//6. Write a Java program to clone a hash set to another hash set.

package HashSet;

import java.util.HashSet;

public class hs6 {
	public static void main(String [] args) {
		
		HashSet<String> hs6 = new HashSet<String>();
		HashSet<String> hs7 = new HashSet<String>();
		
		hs6.add("India-1");
		hs6.add("New-zeland");
		hs6.add("Australia");
		
		System.out.println("The elements of hash set :-"+hs6);
		
		hs7 = (HashSet<String>) hs6.clone();
		System.out.println("The elements after cloning :-"+hs7);
		
	}

}
