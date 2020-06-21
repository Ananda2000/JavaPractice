
/*11. Write a Java program to display the elements and their positions in a linked list. Go to the editor
Click me to see the solution*/

package Collections_Link_List;

import java.util.LinkedList;

public class linkedlist11 {
	public static void main(String [] args) {
		LinkedList<String> ll11 = new LinkedList<String>();
		 ll11.add("1-ll11");
		 ll11.add("2.ll11");
		 ll11.add("3-ll11");
		 ll11.add("4-ll11");
		 int a=0;
		int i=ll11.size();
		for (String string1 : ll11) {
			
					System.out.println("The first element is - "+a+" is "+ string1);
			a++;
		} 
			
		
	}

}
