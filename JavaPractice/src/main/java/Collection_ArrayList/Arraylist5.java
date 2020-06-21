/*5. Write a Java program to update specific array element by given element. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the position where u need to repleace.");
		Scanner aa = new Scanner(System.in);
		int i = aa.nextInt();
		System.out.println("Enter the text you need to update");
		Scanner s = new Scanner(System.in);
		String ss = s.nextLine();
		
		
		ArrayList<String> al5 = new ArrayList<String>();
		al5.add("Ananda");
		al5.add("soma");
		al5.add("babu");
		al5.add("barat");
		System.out.println("Before adding the elements:" +al5);
		al5.set(i, ss); // we are using set method to update the specific contents.
System.out.println("After adding the elements :" + al5);
	}

}
