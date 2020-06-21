/*6. Write a Java program to find the index of an array element. Go to the editor
Click me to see the solution...*/
package Arrays;

public class arrays6 {

	public static void main(String [] args) {
		int [] i = {5,8,9,11,1000};
		
		int k = i.length;
		System.out.println("The array length:"+k);
		System.out.println("Find the index of elemnt 11");
		for(int n=0;n<k;n++) {
			if(i[n] == 11) {
				System.out.println("The index of elemnt 11 is:"+n);
			}
		}
		
	}
}
