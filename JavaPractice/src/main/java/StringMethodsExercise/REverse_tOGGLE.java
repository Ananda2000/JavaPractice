//9) Write a java program reverse tOGGLE each word in string?

package StringMethodsExercise;

import java.util.Scanner;

public class REverse_tOGGLE {
	
	public static String tOGGLE_method(String s1) {
		String[] words = s1.split("\\s");
		
		String capitalized="";
		String ReverseWords="";
		
		for (String string1 : words) {
			StringBuffer sb = new StringBuffer(string1);
			sb.reverse();
			String first = sb.substring(0, 1);
			String afterFrist = sb.substring(1);
			
			capitalized+=first.toLowerCase()+afterFrist.toUpperCase()+" ";
			
			
		}
		System.out.println("inside the method"+capitalized.trim());
		return capitalized.trim();
	}

	
	public static void main(String [] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("please Enter the string");
		String aa = enter.nextLine();
		
		System.out.println("The enetered string is :"+aa);
		
		System.out.println("The String after capitalizing :"+tOGGLE_method(aa));
	}

}
