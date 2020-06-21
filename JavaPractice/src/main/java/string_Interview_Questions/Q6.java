//Write a java program to reverse a string [a. Using build in method

package string_Interview_Questions;

public class Q6 {

	public static void main(String [] args) {
		
		String s1 ="This is java";
		System.out.println("String before reverse :- "+s1 );
		System.out.println("==============================");
		System.out.println("afrer reversing "+reversed(s1));
	}
	
	public static StringBuilder reversed(String sreverses) {
		
		StringBuilder sb = new StringBuilder(sreverses);
		return sb.reverse();
		
	}
}


/*
 *  OUTPUT IS HERE.
 * String before reverse :- This is java
==============================
afrer reversing avaj si sihT

 */
