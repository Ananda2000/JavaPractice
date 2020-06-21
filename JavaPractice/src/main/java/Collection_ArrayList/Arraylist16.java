
/*16. Write a Java program to clone an array list to another array list. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;

public class Arraylist16 {
	
	public static void main(String [] args) {
		ArrayList<String> al16 = new ArrayList<String>();
		
		al16.add("one16");
		al16.add("Two16");
		ArrayList<String> al16a =(ArrayList<String>)al16.clone(); 
				//al16a.add("three16");
		System.out.println("The arraylist elements before clone :-"+al16);
		//al16a =al16.clone();
		
		System.out.println("The arraylist elements after clone:-"+al16a);
		
	}

}
