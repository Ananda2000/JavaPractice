package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.common.io.FileWriteMode;

public class readAndWRiteingIntoFile {

	public static void main(String [] args) throws IOException {
		   File infile =new File("D:/Anand/Testing.txt");
   	    File outfile =new File("D:/Anand/Testing1.txt");
   	    FileReader fr = null;
   	    FileWriter fw = null;
   	    String line = null;
   	    
   	    try {
			fr = new FileReader(infile);
			fw = new FileWriter(outfile);
			int i;
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			while((line= br.readLine())!= null) {
				//System.out.println((char)i);
				//c =(char) (i);
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			System.out.println("copied successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	    fr.close();
   	    fw.close();
	}
}
