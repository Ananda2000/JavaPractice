package StringMethodsExercise;

public class palindromeProgram {
	
	
	
	
	public static void main(String [] args) {
		
		String pali = "madam1";
		String reversed = palindrome(pali);
		
		if(pali.equals(reversed)) {
			System.out.println("String"+pali+ "is palindrom");
		}
		else {
			System.out.println("String -- "+ pali +" --is not palindrome");
		}
		
	}
	
	public static    String palindrome(String pal) {
		StringBuilder pl1 = new StringBuilder(pal);
		pl1.reverse();
		String rev = pl1.toString();
		return rev;
		
		
	}

}
