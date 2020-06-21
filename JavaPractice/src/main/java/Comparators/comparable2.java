package Comparators;

import java.util.ArrayList;
import java.util.Collections;

public class comparable2 {

	public static void main(String[] args) {
		
		//create an array list.
		ArrayList<Movie> al = new ArrayList<Movie>();
		
		
		al.add(new Movie("Ananda" , 1986, 8.5));
		al.add(new Movie("soma", 1990, 9.0));
		al.add(new Movie("Babu", 1985, 5.5));
		al.add(new Movie("Malli", 1984, 9.9));
		
		System.out.println("Sorting normal with collections.sort ()");
		
		Collections.sort(al);
		for (Movie movie : al) {
			System.out.println(movie.getName() + " " +movie.getRating() +" "+ movie.getYear());
			
		}
	}

}
