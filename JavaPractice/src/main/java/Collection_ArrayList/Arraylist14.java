/*14. Write a Java program of swap two elements in an array list. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist14 {
	
	public static void main(String [] args) {
		  ArrayList<String> al14 = new ArrayList<String>();
		  al14.add("one");
		  al14.add("two");
		  al14.add("Three");
		  
		  System.out.println(al14);
		  Collections.swap(al14, 0, 2);
	System.out.println("The collection list after swapping:"+al14);
	}

}
