package string_Interview_Questions;

public class Q4 {
	
	 public static void main (String [] args) {
		 String s1="i";
		 
		 int count = s1.length();
		 System.out.println("The length of the string"+count);
		 
		 for(int i=0; i<count;i++) {
			 System.out.println("in first for loop");
			 for(int j=i+1; j<count;j++) {
				 System.out.println("In 2nd for loop");
				 if(s1.charAt(i)==s1.charAt(j)) {
					 System.out.println("The reapeat word is :"+s1.charAt(i));
				 }
			 }
		 }
	 }

}
 