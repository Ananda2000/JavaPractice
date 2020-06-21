//4) Write a java program to count the number of words in a string ?

package string_Interview_Questions;

public class Q44 {
	
	public static void main(String [] args) {
		
		String s1 ="this is java  ";
		
		int count;
		
		count = wordcountmethod(s1);
		System.out.println("The string contains total "+count +" words");
	}
	
	public static int wordcountmethod(String a1) {
		
		String [] words = a1.split(" ");
		
		int length1 = words.length;
		
		return length1;
		
	}

}
