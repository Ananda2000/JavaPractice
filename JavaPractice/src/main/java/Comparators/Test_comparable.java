package Comparators;

import java.util.ArrayList;
import java.util.Collections;

public class Test_comparable {
	
	public static void main(String [] args) {
		
		
		ArrayList<Comparable1> als = new ArrayList<Comparable1>();
		
		
		als.add(new Comparable1(102, "Ananda", 30));
		als.add(new Comparable1(101, "viaj", 23));
		als.add(new Comparable1(103, "soma", 34));
		//als.add(new Comparable1(104, "Babu reddy", 35));
		
		
		Collections.sort(als);
		System.out.println(als);
		
		for (Comparable1 namess : als) {
			System.out.println(namess.rollno +"--"+ namess.age +" -- "+ namess.name);
			
		}
	}

}
