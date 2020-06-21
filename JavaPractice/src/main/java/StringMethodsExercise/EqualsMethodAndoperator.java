// working with equals() and "==" operator....

package StringMethodsExercise;

public class EqualsMethodAndoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String s1="Hello";
			String s2="hello";
			String s3="Hello";
			String s4 = new String("Hello");
			
			System.out.println(s1.equals(s2));
			System.out.println(s1==s2);
			System.out.println(s1.equals(s3));
			System.out.println(s1==s3);
			System.out.println(s1.equals(s4));
			System.out.println(s1==s4);
	}

}
