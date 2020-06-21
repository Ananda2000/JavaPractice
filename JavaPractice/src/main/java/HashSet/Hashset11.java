// Write a Java program to compare two sets and retain elements which are same on both sets.

package HashSet;

import java.util.HashSet;

public class Hashset11 {
	
	public static void main(String [] args) {
		HashSet<String> hs11 = new HashSet<String>();
		hs11.add("hashsetll-1");
		hs11.add("hs11-2");
		hs11.add("hs11-3");
		
		System.out.println("The elements of hs11 hashset");
		System.out.println(hs11);
		
		HashSet<String> hs12 = new HashSet<String>();
		hs12.add("hs12-1");
		hs12.add("hs11-2");
		hs12.add("hs12-3");
		
		System.out.println("The elments of hs12 hashset");
		System.out.println(hs12);
		
		hs11.retainAll(hs12);
		System.out.println("After comapring result");
		System.out.println(hs11);
		
		
	}

}
