package string_Interview_Questions;

import java.util.Arrays;

public class Q5 {
	
	public static void main(String [] args) {
		String s1="this is java";
		String s2 ="ia this java";
		s1.toLowerCase();
		s2.toLowerCase();
		
		annagramprogram(s1,s2);
		
		
	}

	
	public static void annagramprogram(String a1,String a2) {
		
		int count=0;
		boolean a = false;
		char [] cs1= a1.toCharArray();
		char [] cs2 = a2.toCharArray();
		int length1 = cs1.length;
		int length2 = cs2.length;
		
		if(length1!=length2) {
			System.out.println("The string are not ANAGRAMS");
		}
		if(length1 == length2) {
			Arrays.sort(cs1);
			Arrays.sort(cs2);
			
			a = Arrays.equals(cs1, cs2);
		
		}
		
		if(a) {
			System.out.println(a1  +" and " +a2+ " are anagrams");
		}else {
			System.out.println(a1  +" and " + a2 + " are not anagrams");
		}
	}
}
