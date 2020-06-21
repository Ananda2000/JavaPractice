package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;

import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class ReadFileDisplayData {
	
	@Test
	public void readDataFromFile() throws IOException {
		File ff = new File("D:/Anand/Testing.txt");
		FileReader f1 = new FileReader(ff);
		BufferedReader fr = new BufferedReader(f1);
		//LineNumberReader ln = new LineNumberReader(f1);
		int linecount =0;
		int wc=0;
		String ab ="one";
		String aa;
	String bb;
	//bb =FileUtils.readFileToString(f1);
		while((aa=fr.readLine()) != null){
			linecount++;
			String[] words = aa.split(" ");
			for (int i = 0; i < words.length; i++) {
				if(words[i].equalsIgnoreCase("is")) {
					wc++;
					words[i] ="Anand";
					//System.out.println(words[i]);
				}
				System.out.println(words[i]);
				aa =aa+words[i];

			}
			System.out.println("+++++++++++++++++++++++++++" +wc);
			if (linecount == 1) {
				System.out.println("the 1st line is printed");
				String line1 = aa;
				System.out.println("The line 1 is :"+line1);
				System.out.println("=============================");
				
				
				
			}
			System.out.println(aa);
			
		}
		System.out.println("The reader is :"+linecount);
		//String aa = fr.toString();
		
		//System.out.println("The data is :"+aa);
	}

}


