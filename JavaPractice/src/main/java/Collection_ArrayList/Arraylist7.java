
/*7. Write a Java program to search an element in a array list. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import javax.naming.directory.SearchControls;

public class Arraylist7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al7 = new ArrayList<String>();
		al7.add("annd");
		al7.add("Kumar");
		al7.add("giri");
		al7.add("is");
		 System.out.println("The array list elements are :"+al7);
		
		String aa = "is";
		System.out.println("The string size is:"+al7.size());
		if (al7.contains(aa)) {
			System.out.println("The string:---"+aa+"----is found in the list");
		}
			else {
				System.out.println("The String :"+aa+"Not found in the list");
			}
		}
				
			
		}

	
	


