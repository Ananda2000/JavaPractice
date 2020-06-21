package Comparators;

public class SubstringFinding {
	
	  
		public static void main(String args[]){  
		String s1="this is index of example";//there are 2 's' characters in this sentence  
		int index1=s1.lastIndexOf(" ");//returns last index of 's' char value  
		System.out.println(index1+1);//6 
		String s2=s1.substring(index1); 
		System.out.println(s2);
		}
}  



