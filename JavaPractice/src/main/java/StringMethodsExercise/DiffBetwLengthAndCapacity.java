package StringMethodsExercise;

public class DiffBetwLengthAndCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1="012345  ";
			String s2="";
			String s3="012345";
			StringBuffer sb= new StringBuffer(s1);
			StringBuilder sbuild= new StringBuilder(s2);
			//sbuild.setLength(21);
			System.out.println("String length ==="+sb.length());
			
			System.out.println("String capacity =="+sb.capacity());
			System.out.println("The length of empty String ---------"+sbuild.length());
			System.out.println("The capacity of empty string -----------"+sbuild.capacity());
			
			char[] dst = null;
			//s1.getChars(1, 3,  dst, 3);
			//System.out.println("The substring -- using getchars methods"+dst);
			
			//The use of region matches method in string..
			
			System.out.println(s1.regionMatches(0,s3 , 0, 2));
			
			
			
	}

}
// The default capacity is 16.. 
// The length of empty string is 0...

