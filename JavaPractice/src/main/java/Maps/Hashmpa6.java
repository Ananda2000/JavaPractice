package Maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmpa6 {
	
	  public static void main(String [] args) {
		  
		  HashMap<Integer, String> hm6 = new HashMap<Integer, String>();
		  hm6.put(100, "America");
		  hm6.put(200, "china");
		  hm6.put(300, "Kuwait");
		  hm6.put(400, "India");
		  
		  System.out.println("Result of original map:- "+hm6);
		  
		  // 
		  HashMap<Integer,String> new_hm6 = new HashMap<Integer, String>();
		  
		  new_hm6 = (HashMap)hm6.clone();
		  
		  // output after cloning
		  System.out.println("The result oafter cloning is:"+new_hm6);
		  
		
	}

}
