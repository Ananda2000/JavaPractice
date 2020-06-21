//Write a java program to count the total number of occurrance of a given character in a string

package string_Interview_Questions;
	
public class Q55 {
	
	public static void main(String [] args) {
		
		
		String s1="this is java";
		char ch ='a';
		
		System.out.println("The charector  "+ ch + " occurs " +count(s1,ch)+"times");
	}

	
	public static int count(String a1, char cc) {
		
		int res=0;
		int le=a1.length();
		for(int i=0;i<le;i++) {
			
		
		if(a1.charAt(i) == cc) {
			res++;
		}
		}
		return res;
		
	}
}
