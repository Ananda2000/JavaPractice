/*
//10. Write a Java program to find the maximum and minimum value of an array. Go to the editor
Click me to see the solution.*/

package Arrays;

public class arrays10 {
	
	public static void main(String [] args) {
		int [] a = {1,2,3,4};
		int max=0;
		int min=0;
		int k = a.length;
		for(int i=0;i<k;i++) {
			if(i==0) {
				min=a[i];
			}
		if(min>a[i]) {
			min = a[i];
		}
		
		if (max<a[i]) {
			max =a[i];
		}
		}
		System.out.println("The min value is :"+min);
		System.out.println("The maximum value is :");
		
		
	}

}
