
/*3. Write a Java program to insert an element into the array list at the first position. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("One");
		al2.add("Two");
		al2.add("Three");
		al2.add("Five");
		System.out.println("The array elements are:" +al2);
al2.add(0, "Zero");
System.out.println("The array elements after insertion :"+al2);
	}

}
