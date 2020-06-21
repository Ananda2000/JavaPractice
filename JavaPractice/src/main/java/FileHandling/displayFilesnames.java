// Display the list of file names from the folder.
package FileHandling;

import java.io.File;

public class displayFilesnames {
	public static void main(String [] args) {
		File ff = new File("D:\\Anand");
		
		String stringname [] = ff.list();
		
		for (String string1 : stringname) {
			System.out.println(string1);
			
		}
	}

}
