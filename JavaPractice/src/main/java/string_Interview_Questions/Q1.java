//1) write a java program to print the duplicate characters in string. 

package string_Interview_Questions;

public class Q1 {
	
	public static void main(String [] args) {
		String  names = "k This is java k";
		int g=0;
		//System.out.println(names);
		char [] ch =names.toCharArray();
		char [] ch1= new char[ch.length];
		//System.out.println(ch);
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					ch1[g] =ch[i];
					g++;
					System.out.println("The repeated character -"+ch[i]);
					break;
				}
			}
		}
		//String gg = ;
		for(int i=0;i<ch1.length;i++) {
			System.out.print(ch1[i]);
		}
		System.out.println("---------------");
		//System.out.println("the repeated array is ---------------"+gg);
		
	}

}
