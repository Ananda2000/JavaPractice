//13) How to convert String to int in java?

package StringMethodsExercise;

public class StringToInt {

	public static void main(String[] args) {
		String s ="200";
		int i = Integer.parseInt(s);
		System.out.println("The value of i "+i);
		System.out.println("The value of s "+s);
		System.out.println("The concatinated vaue is "+ s+"100");
		System.out.println(i+100);
	}
}
