package StringMethodsExercise;

import java.util.Collections;
import java.util.Set;

public class Duplicatewords {

	private static final String Null = null;

	public static void main(String [] args) {
		String test ="This sentence contains two words, one and two";
		Set<String> duplicates = duplicatwords(test);
		System.out.println("The duplicate words ="+test);
		System.out.println("The duplicate words"+duplicates);
	}

public static Set<String> duplicatwords (String input){
	if(input == Null || input.isEmpty()) {
		return Collections.emptySet();
	}
	
	return null;
	
}
}
