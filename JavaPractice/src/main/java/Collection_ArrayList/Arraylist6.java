/*6. Write a Java program to remove the third element from a array list. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;

public class Arraylist6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al6 = new ArrayList<String>();
		
		al6.add("first element");
		al6.add("2nd Element");
		al6.add("3rd Element");
		al6.add("4th Element");
		System.out.println("The elements at before removing :"+al6);
		System.out.println("The size of collection:"+al6.size());
		
		al6.remove(2);
		System.out.println("The list of elements after removing"+al6);
		System.out.println("The size of collection after remove :"+al6.size());
	}

}
