package StringMethodsExercise;

public class StringBufferReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="This is a java";
		String s2="was";
		StringBuffer sb= new StringBuffer(s1);
		sb.replace(5, 7, s2);
		
		System.out.println(sb);
		
		
	}

}
