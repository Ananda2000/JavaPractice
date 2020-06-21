/*9. Write a Java program to insert an element (specific position) into an array. Go to the editor
Click me to see the solution.*/
package Arrays;

import java.util.Arrays;

public class arrays9 {
	public static void main(String [] args) {
		int[] my_array9 = {25, 14, 56, 15};
		int[] my_array9res = new int[my_array9.length + 1];
		System.out.println("Original Array : " + Arrays.toString(my_array9));

		int addOnIndex = 2;
		int added = 35;

		for (int i = 0, j = 0 ; i < my_array9.length && j < my_array9.length;) {
		if(i == addOnIndex){
		my_array9res[j] = added;
		j = i + 1;
		j++;
		} else {
		my_array9res[j] = my_array9[i];
		i++;
		j++;
		}
		}	
		System.out.println(Arrays.toString(my_array9res));
	}}
