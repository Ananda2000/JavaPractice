//7. Write a Java program to sort keys in Tree Map by using comparator.

package Maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Treemap7 {
	public static void main (String [] args) {
		TreeMap<Integer, String> Tmp7 = new TreeMap<Integer, String>();
		
		Tmp7.put(3, "Anand"); Tmp7.put(5, "puppet"); Tmp7.put(1, "Maga");
		System.out.println("The map elements are:"+Tmp7);
		
		
	}

}

class comparator_map implements Comparator<String>(){
	


public int compare(String o1, String o2) {
	// TODO Auto-generated method stub
	return o2.compareTo(o1);
}
}