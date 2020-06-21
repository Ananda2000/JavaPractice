/*17. Write a Java program to empty an array list. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;

public class Arraylist17 {
	
	public static void main(String [] args) {
		
		ArrayList<String> al17 = new ArrayList<String>();
		
		al17.add("one17");
		al17.add("Two17");
		
		System.out.println("The arraylist content := " +al17);
		al17.removeAll(al17);
		System.out.println("after removing the elments from := "+al17);
	}

}
