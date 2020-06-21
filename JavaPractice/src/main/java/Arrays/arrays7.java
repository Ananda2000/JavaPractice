/*7. Write a Java program to remove a specific element from an array. Go to the editor
Click me to see the solution.
*/

package Arrays;

import java.util.Arrays;

public class arrays7 {
	public static void main(String [] args) {
		int [] i = {5,8,9,11,1000,1050};
		int len = i.length;
		System.out.println("remove the element 1050 from the array");
		for(int n=0;n<len-1;n++) {
			i[n]=i[n];
			System.out.println(i[n]);
		}

}
}
