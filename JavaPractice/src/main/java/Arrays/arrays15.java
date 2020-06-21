/*15. Write a Java program to find the common elements between two arrays of integers. Go to the editor
Click me to see the solution.*/

package Arrays;

public class arrays15 {
	public static void main(String [] args) {
		
		int[] a = {1,2,55,66};
		int [] b = {66,5,6,8};
		
		int sizeofa = a.length;
		int sizeofb = b.length;
		
		for (int i=0;i<sizeofa ; i++)
			for(int j=0;j<sizeofb;j++)
				if(a[i] == b[j]) {
					System.out.println("The common elements is :"+a[i]);
				}
		
		
	}

}
