/*3. Write a Java program to add all the elements of a specified tree set to another tree set. Go to the editor
Click me to see the solution*/

package StringMethodsExercise;

import java.util.TreeSet;

public class TreeSet3 {
	
	public static void main(String []args) {
		TreeSet<String> ts3 = new TreeSet<String>();
		ts3.add("Test1");
		ts3.add("test2");
		
		TreeSet<String> ts31 = new TreeSet<String>();
		ts31.addAll(ts3);
		
		System.out.println(ts31);
	
	}
}
