
/*14. Write a Java program to find the common elements between two arrays (string values). Go to the editor
Click me to see the solution.*/

package Arrays;

import java.util.Arrays;

public class arrays14 {
	
	public static void main(String [] args) {
		String a[] = {"aaa","bbb","ccc"};
		String b[] = {"ggg","bbb","ccc"};
		
		int asize = a.length;
		int bsize = b.length;
	System.out.println(Arrays.equals(a, b));
	for(int i=0;i<asize;i++)
		for(int k=0;k<bsize;k++)
			if(a[i] == b[k])
				System.out.println("The similar is :"+ a[i]);
	}

}
