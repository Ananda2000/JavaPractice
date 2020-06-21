/*22. Write a Java program to print all the elements of a ArrayList using the position of the elements. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;

public class Arraylist22 {
	
	public static void main(String [] args) {
		ArrayList<String> al22 = new ArrayList<String>();
		al22.add("one22");
		al22.add("Two22");
		al22.add("Three22");
		
		int i=al22.size();
		for(int a=0;a<i;a++) {
			//System.out.println("lsjhdfjsd");
		
		System.out.println("The element at index "+a+" is:-"+al22.get(a));
		}
	}

}
