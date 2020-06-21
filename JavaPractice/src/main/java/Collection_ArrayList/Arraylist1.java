/*Write a Java program to create a new array list, add some colors (string) and print out the collection.
 *  Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;

public class Arraylist1 {
	
	public static void main(String [] args) {
		ArrayList<String> al = new ArrayList <String>();
		al.add("Red");
		al.add("Green");
		al.add("YELLOW");
		int len = al.size();
	System.out.println("The size of al is :"+len);
	 for (String string : al) {
		System.out.println("----"+string);
	}
	}
}
