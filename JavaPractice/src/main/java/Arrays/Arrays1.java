/*1. Write a Java program to sort a numeric array and a string array. Go to the editor*/

package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class Arrays1 {
	public static void main(String [] args) {
		
		int [] i = {5,6,23,456,453,77,678,323,544};
		String [] str = {"java","Annda","Babu","zara","Reliance"};
		
		System.out.println("The integer list before sorting array :"+Arrays.toString(i));
		System.out.println("The string list before sorting array :"+Arrays.toString(str));
		Arrays.sort(i);
		
		Arrays.sort(str);
		System.out.println("The integer list After sorting array :"+Arrays.toString(i));
		System.out.println("The string list After sorting array :"+Arrays.toString(str));
		
		for (String string1 : str) {
			
			System.out.println(string1);
		}
		
		
	}

}
