//8. Write a Java program to convert a hash set to a tree set.

package HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class hashset8 {
	public static void main(String [] args) {
		HashSet<String> hs8 = new HashSet<String>();
		TreeSet<String> ts8 = new TreeSet<String>();
		
		
		hs8.add("hamam");
		hs8.add("liril");
		hs8.add("lux");
		hs8.add("lifeboy");
		hs8.add("Dove");
		System.out.println("The has set elements :- "+hs8);
		
		System.out.println("is tree set empty"+ts8.isEmpty());
		
		 ts8.addAll(hs8);
		 
		 System.out.println("The tree set elements after copy from hashset :-"+ ts8);
		 
		 for (String string21 : ts8) {
			 System.out.println(string21);
			
		}
		
	}

}

