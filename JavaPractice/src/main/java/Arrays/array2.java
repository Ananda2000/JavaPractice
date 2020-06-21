
/*2. Write a Java program to sum values of an array. Go to the editor
Click me to see the solution*/

package Arrays;

public class array2 {
	public static void main (String [] args) {
	
	int[] i = {2,5,78,56};
	
	int k = i.length;
	System.out.println("The array lenght is :"+ k);
	int n=0;
	
		/*
		 * while(k > 0) {
		 * 
		 * n =n+i[g]; g++; k--; }
		 */
	for (int g=0; g<k; g++ ) {
		n = n+i[g]; // calculating the total of array elements
	}
	System.out.println("The total of array is:"+ n);
	
	float avg=0;
	avg = n/k;
	System.out.println("The avg of array is :"+avg);

}
}
