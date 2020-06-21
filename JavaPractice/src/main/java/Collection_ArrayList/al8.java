/*8. Write a Java program to sort a given array list. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class al8 {
	
	
public static void main (String [] args) {
	ArrayList<String> al8 = new ArrayList<String>();
	al8.add("ZZZ");
	al8.add("YYY");
	al8.add("888");
	al8.add("000");
	System.out.println("As Arraylist :"+al8);
	Collections.sort(al8);
	System.out.println("The arraylist after sorting :"+ al8);
	
	
	
		/*
		 * for (int i=0;i<gg;i++) { if(al8[i] < al8[i+1])
		 * 
		 * }
		 */
}
}
