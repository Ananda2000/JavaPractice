/*8. Write a Java program to copy an array by iterating the array. Go to the editor
Click me to see the solution.*/

package Arrays;

import java.util.Arrays;

public class array8 {
public static void main(String [] args) {
	int [] i = {5,8,9,11,1000,1050};
	
	System.out.println("The array elements are :"+Arrays.toString(i));
	int len = i.length;
	int [] k = new int[len];
	
	for(int g=0;g<len;g++) {
		k[g] = i[g];
	}
	System.out.println("The array elements are : "+ Arrays.toString(k));
	
	
	
	
	
	
	
	
	
	
}
}
