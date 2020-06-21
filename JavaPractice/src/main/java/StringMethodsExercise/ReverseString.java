package StringMethodsExercise;

public class ReverseString {

	
	public static void reveringString(String aa) {
		
		StringBuffer aa1 = 	new StringBuffer(aa);
		
		System.out.println(aa1.reverse());
	}
	
	public static void main(String [] args) {
		reveringString("This is anand");
	}
	
}
