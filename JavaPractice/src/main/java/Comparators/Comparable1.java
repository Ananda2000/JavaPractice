package Comparators;

public class Comparable1 implements Comparable<Comparable1> {
	
	int rollno;
	String name;
	int age;
	
	Comparable1 (int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age =age;
	}
	
	//@Override
	public int compareTo(Comparable1 c1) {
		// TODO Auto-generated method stub
		if(age==c1.age) {
			return 0;
		}
		else if (age >c1.age) {
			return 1;
		}
		else
			return -1;
	}
}
