/*9. Write a Java program to find the numbers less than 7 in a tree set. Go to the editor
Click me to see the solution*/

package TreeSets_123;

import java.util.TreeSet;

public class Treeset9 {
	public static void main(String[] args) {
		TreeSet<Integer> ts7 = new TreeSet<Integer>();
		ts7.add(1);
		ts7.add(4);
		ts7.add(9);
		ts7.add(10);
		for (Integer integer : ts7) {
			if(integer < 7) {
				System.out.print(integer);
				System.out.print(" ,");
				
			}
		
		}
		System.out.println();
	}

}
