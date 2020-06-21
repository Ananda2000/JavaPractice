package Comparators;

public class Movie implements Comparable<Movie> {
	
	private String name;
	private int year;
	private double rating;
	
	//constructor of movie class
	public Movie(String mn, int yr, double ra) {
		this.name = mn;
		this.rating = ra;
		this.year = yr;
	}
	
	//
	
	

public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		//return this.year - m.year;
	return this.year;
	}

	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	
	public double getRating() {
		return rating;
	}

}
