package threads;

import JDBC.threads;

public class ThreadDemo {
public static void main(String [] args) {
	new NewThreadCreation();
	try {
		for (int i = 5; i >0; i--) {
			System.out.println("The main thread -"+i);
			Thread.sleep(1000);
			
		}
		
	} catch (Exception e) {
		System.out.println("Main thread interrupted");
	}
	System.out.println("Child thread interrupted");
}
}
