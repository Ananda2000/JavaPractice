/*16. Write a Java program to remove duplicate elements from an array. Go to the editor
Click me to see the solution.*/

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class arrays16 {
	
	public static void main(String [] args) {
		
		int aa[] = {2,8,5,8,6};
		//Arrays.sort(aa);
		
		int j=0;
		
		int aa_length = aa.length;
		int []bb = new int[aa_length];
		for(int g=0;g<aa_length-1;g++)
			
				 
				if(aa[g]!=  aa[g+1]) {
					System.out.println(aa[g]);
					bb[j++] = aa[g];
					
					//System.out.println(bb[j]);
				}
		bb[j++] = aa[aa_length-1];
		
		for(int i=0;i<j;i++) {
			aa[i] = bb[i];
			System.out.println(aa[i]);
		}
		System.out.println(aa);
		
	}

}
