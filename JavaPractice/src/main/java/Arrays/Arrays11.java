
/*11. Write a Java program to reverse an array of integer values. Go to the editor
Click me to see the solution.*/

package Arrays;

import java.util.Arrays;

public class Arrays11 {
	
	public static void main(String [] args) {
		 int [] a = {1,2,3,4};
		 
	
		 int g = a.length;
		 int kk=0;
		 int [] b = new int[g];
		 for(int i=g-1;  i>=0;i--) {
			 b[kk] =a[i];
			 kk++;
			 
			 
		 }
	System.out.println("The arrays at given time :-"+ Arrays.toString(a));
	System.out.println("The arrays at after reverse :-" + Arrays.toString(b));
	}

}
