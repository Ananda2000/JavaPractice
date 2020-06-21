/*1. seperate the number,charecters and special charecters in give string ,
	 * store in different string and display? [ab#$123oi] */

package InterviewPrograms;

public class FirstProgram {
	
	public static void main(String [] args) {
		
		String s1= "ab#$123oi";
		int len = s1.length();
		String letters = " " ;
		String digitse=" ";
		String specilchar=" ";
		
		for(int i=0;i<len;i++) {
		if(Character.isLetter(s1.charAt(i))) {
			letters = letters +s1.charAt(i);
		}else if (Character.isDigit(s1.charAt(i))) {
			digitse =digitse+ s1.charAt(i);
		}
		else {
			specilchar=specilchar+s1.charAt(i);
		}
		}
		System.out.println("The letters are -"+ letters);
		System.out.println("the digits are -"+digitse);
		System.out.println("The special characters -"+specilchar);
	}

}
