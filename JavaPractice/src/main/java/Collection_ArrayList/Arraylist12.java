/*12. Write a Java program to extract a portion of a array list. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Arraylist12 {
	
	public static void main(String [] args) {
		
		
		int a=2;
		List al12 = new ArrayList();
		
		al12.add("Dravid");
		al12.add("Gilkrist");
		al12.add("Attupattu");
		al12.add("warne");
		
		System.out.println("The elements of array list are :"+al12);
		
		System.out.println("The array list at "+a+" is :-"+al12.get(a));
		
		System.out.println("list will display for index range:-"+al12.subList(0, a));
		
	}

}
