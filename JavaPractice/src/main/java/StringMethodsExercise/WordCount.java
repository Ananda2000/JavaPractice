package StringMethodsExercise;

public class WordCount {
	
	public static void main(String []args) {
		String str1 ="Anand is   here  ";
		
		int a =str1.split("\\s+").length;
		System.out.println("The words of the string :"+a);
		
		// 
	}

}
