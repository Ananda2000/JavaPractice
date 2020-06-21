package threads;

public class IsaliveAndJoin {
	public static void main(String [] args) {
		Isaliveandjointhread t1 = new Isaliveandjointhread("One");
		Isaliveandjointhread t2 = new Isaliveandjointhread("Two");
		Isaliveandjointhread t3 = new Isaliveandjointhread("three");
		
		System.out.println("1st thread status "+t1.t.isAlive());
		System.out.println("2nd thread status"+t2.t.isAlive());
		System.out.println("3rd thread status"+t3.t.isAlive());
		
		
			
			try {
				t1.t.join();
				t2.t.join();
				t3.t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("1st thread status "+t1.t.isAlive());
			System.out.println("2nd thread status"+t2.t.isAlive());
			System.out.println("3rd thread status"+t3.t.isAlive());
			
		System.out.println("Exit of main thread");
	}
	

}
