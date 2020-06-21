
/*21. Write a Java program to replace the second element of a ArrayList with the specified element. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;

public class Arraylist21 {
	
	public static void main (String [] args) {
		
	ArrayList<String> al21 = new ArrayList<String>();
	
	al21.add("one21");
	al21.add("two21");
	al21.add("Three21");
	
	System.out.println("Array list elements before replace:-"+ al21);
	al21.set(2, "Replace");
	System.out.println("Arraylist after replace :"+al21);
	
	}

}
