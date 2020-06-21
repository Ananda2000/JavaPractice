//10. Write a Java program to compare two hash set.

package HashSet;

import java.util.HashSet;

public class hashset10 {

	public static void main(String [] args) {
		HashSet<String> hs10 = new HashSet<String>();
		hs10.add("Doctor");
		hs10.add("clinic");
		hs10.add("surgeon");
		hs10.add("medication");
		
		
		System.out.println("The elemnts of hashset -"+hs10);
		HashSet<String> hscomp = new HashSet<String>();
		hscomp.add("Doctor");
		hscomp.add("Doctor1");
		System.out.println(hs10.containsAll(hscomp));
		
		for (String string12 : hs10) {
			System.out.println(hscomp.contains(string12));
			
		}
		
		
		
	
		
	}
}
