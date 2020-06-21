// example of string startswith() and endswith() method..

package StringMethodsExercise;

public class StartsWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="This is java ";
		System.out.println(s1.startsWith("this"));
		System.out.println(s1.startsWith("This"));
		System.out.println(s1.startsWith("is",5));
		System.out.println(s1.endsWith("java "));

	}

}
