//6B) WITHOUT USING BUILD IN METHOD. reverse the string

package string_Interview_Questions;

public class Q6a {

		public static void main(String[] args) {
			String s2 = "This is java";
			
			System.out.println("String before reverse:- "+s2);
			System.out.println("==============================");
			System.out.println("String after reverse:-  " +reversedString(s2));
		}
		
		public static String reversedString(String aa) {
			
			int leng = aa.length();
			String a2="";
			for(int i=leng-1;i>=0;i--) {
				a2 = a2+aa.charAt(i);
			}
			return a2;
			
		}
}

/*
 * output -
 * /String before reverse:- This is java 
 * ==============================
 * String after reverse:- avaj si sihT
 */