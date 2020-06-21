package threads;

public class NewThreadCreation implements Runnable{
	
	Thread t;
	public NewThreadCreation() {
		// TODO Auto-generated constructor stub
		t = new Thread(this, "Demo Thread1");
		System.out.println("Child thread 1 -"+t);
		t.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		
		try {
			for (int i = 5; i >0 ; i--) {
				System.out.println("Child thread 2 -"+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Child thread interrupted");
		}
		System.out.println("Exit of child thread");
		
	}
	

}
