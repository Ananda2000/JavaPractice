//7. Write a Java program to convert a hash set to an array

package HashSet;

import java.util.HashSet;

public class hashset7 {
	
	public static void main (String [] args) {
		
		HashSet<String> hs7 = new HashSet<String>();
		hs7.add("Guru");
		hs7.add("Local");
		hs7.add("international");
		
		System.out.println("------"+hs7);
		String[] newarray = new String[hs7.size()];
		hs7.toArray(newarray);
		
		//System.out.println(newarray);
		System.out.println("The array elements :-");
		for (String eleString1 : newarray) {
			System.out.println(eleString1);
			
		}
		
	}

}
