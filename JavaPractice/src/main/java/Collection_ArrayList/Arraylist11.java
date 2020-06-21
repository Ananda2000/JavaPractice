/*10. Write a Java program to shuffle elements in a array list. Go to the editor
Click me to see the solution
*/

package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist11 {
	
	public static void main(String [] args) {
		
		List	al11= new ArrayList();
		
		al11.add("Kumar");
		al11.add("Queen");
		al11.add("servent");
		al11.add("pass");
		al11.add("Fail");
		
		System.out.println("The list of elements are :"+al11);
		
		Collections.shuffle(al11);
		System.out.println("The list of elements after shuffle are :"+al11);
	}

}
