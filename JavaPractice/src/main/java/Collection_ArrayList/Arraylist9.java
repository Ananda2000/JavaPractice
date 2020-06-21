/*9. Write a Java program to copy one array list into another. Go to the editor
Click me to see the solution
*/

package Collection_ArrayList;

import java.nio.file.CopyOption;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylist9 {
	public static void main(String [] args) {
		ArrayList<String> gg = new ArrayList<String>();
		ArrayList<String> hh = new ArrayList<String>();
		
		gg.add("one");
		gg.add("Two");
		gg.add("Three");
		System.out.println("The elements of arraylist gg="+ gg);
		System.out.println("The elemnts of arraylist hh ="+hh);
		/*
		 * hh= (ArrayList<String>) gg.clone(); System.out.println("asdfsdf ====="+
		 * gg.clone()); System.out.println("Array list after coping ="+hh);
		 */
		
		hh.addAll(gg);
		System.out.println("Array list copying ="+hh);
		
	}

}
