/*13. Write a Java program to find the duplicate values of an array of string values. Go to the editor
Click me to see the solution.*/

package Arrays;

import java.util.Arrays;

public class arrays13 {
	public static void main(String [] args) {
		
		String a[] = {"Anand","Guru","Jay","Saravana","karthi","Palani","Jay"};
		String b[];
		
		System.out.println("The array strings are:"+Arrays.toString(a));
		
		int sizes = a.length;
		
		for(int i=0;i<sizes;i++) {
			for(int g=i+1;g<sizes;g++) {
				
				if(a[i].equalsIgnoreCase(a[g]) && i!=g) {
					System.out.println("The dubplicate element is :"+a[i]);
				}
				
			}
		}
		
		
	}

}
