/*4. Write a Java program to retrieve an element (at a specified index) from a given array list. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number for selection: ");
		 Scanner a = new Scanner(System.in); 
		 int i = a.nextInt();
		 System.out.println(" ");
		 
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("colur one");
		al4.add("Colour two");
		al4.add("colour three");
		al4.add("colour four");
		al4.add("5 colour");
	//	System.out.println(al4.get(i));
		
		 if (i>= 0 && i<5) { System.out.println(al4.get(i)); } else { System.out.
		 println("The number range should be 0 to 5 , you entered value is :" + i); }
		 

	}

}
