package StringMethodsExercise;

public class String_1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "This is java";
		String s2 = new String(s1);
		s1.concat(s2);
		s2 = s1+" this is java2";
		
		System.out.println(s2);
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1);
		sb1.append(s1);
		sb1.reverse();
		System.out.println(sb1);
	}

}
