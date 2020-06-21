//9. Write a Java program to convert a hash set to a List/ArrayList

package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class hashset9 {
	
	public static void main(String [] args) {
		HashSet<String> hs9 = new HashSet<String>();
		ArrayList<String> alhs9 = new ArrayList<String>();
		hs9.add("Fog");
		hs9.add("KS");
		hs9.add("Denim");
		hs9.add("Killer");
		
		System.out.println("The list of elmeents in hashset :");
		System.out.println(hs9);
		
		System.out.println("is the arraylist elements empty:"+alhs9.isEmpty());
		alhs9.addAll(hs9);
		
		System.out.println("The array list elements are :-"+alhs9);
		
		System.out.println("is the arraylist elements empty:"+alhs9.isEmpty());
 	}

}


