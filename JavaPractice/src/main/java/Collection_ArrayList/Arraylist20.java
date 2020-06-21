/*20. Write a Java program to increase the size of an array list. Go to the editor
Click me to see the solution*/
package Collection_ArrayList;

import java.util.ArrayList;

public class Arraylist20 {

	public static void main(String [] args) {
		
		ArrayList<String> al20 = new ArrayList<String>();
		 al20.add("One20");
		 al20.add("Two20");
		 System.out.println("The size of arraylist al20 is:-"+al20.size());
		 al20.ensureCapacity(7);
		 
		 System.out.println("The size of arraylist after ensure the capacity:-"+al20.size());
	}
}
