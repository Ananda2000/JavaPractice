//6) Write a java program to capitalize each word in string?


package StringMethodsExercise;

import java.util.Scanner;

public class CapitalizeLetters {
	
	public static String capitalizeletters(String s1) {
		
		String[] words = s1.split("\\s");
	
		String capitalized="";
		
		for (String string1 : words) {
			String first = string1.substring(0, 1);
			String afterFrist = string1.substring(1);
			
			capitalized+=first.toUpperCase()+afterFrist+" ";
			
		}
		System.out.println("inside the method"+capitalized.trim());
		return capitalized.trim();
	}

	
	public static void main(String [] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("please Enter the string");
		String aa = enter.nextLine();
		
		System.out.println("The enetered string is :"+aa);
		
		System.out.println("The String after capitalizing :"+capitalizeletters(aa).toString());
	}
}
