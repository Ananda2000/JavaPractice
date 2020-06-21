/*11. Write a Java program to reverse elements in a array list. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist10 {
	
	public static void main (String [] args) {
		ArrayList<String> al10 = new ArrayList<String>();
		
		al10.add("one 1");
		al10.add("Two 2");
		al10.add("three 3");
		System.out.println("The elements before reverse:"+al10);	
		
		Collections.reverse(al10);
		
		System.out.println("The elements after reverse:"+al10);
		
	}
			
		
}
	

