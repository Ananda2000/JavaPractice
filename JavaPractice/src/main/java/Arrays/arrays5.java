/*5. Write a Java program to test if an array contains a specific value. Go to the editor.
Click me to see the solution.*/

package Arrays;

public class arrays5 {
	public static void main(String [] args) {
		int [] i = {5,8,9,11,1000};
		
		int k = i.length;
		System.out.println("The array lenght= "+k);
		int g = 1000;
		
		for(int l=0;k>l;l++) {
			System.out.println("The index is :"+l);
			if(i[l] == g) {
				System.out.println("The array contains the element :-"+g);
			}
		}
	}

}
