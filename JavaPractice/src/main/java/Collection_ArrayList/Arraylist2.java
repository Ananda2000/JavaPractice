
/*2. Write a Java program to iterate through all elements in a array list. Go to the editor
Click me to see the solution*/

package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList< String> al1 = new ArrayList<String>();
		
		al1.add("Colour1");
		al1.add("colour2");
		al1.add("colour 3");
		al1.add("colour4");
		
		int arraysize = al1.size();
		System.out.println("The array list size:"+al1);
		Iterator itr = al1.listIterator();
		{
			while (itr.hasNext()) {
				System.out.println("------"+ itr.next());
				
			}
		}
		
		
	}

}
