//threads example without using synchronize methods...

package threads;

import JDBC.threads;

public class Synchronization1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			callme target = new callme();
			caller ob1 = new caller(target, "Hello");
			caller ob2 = new caller(target, "good morning");
			caller ob3 = new caller (target, "Anand");
			
			// wati for threads to end..
			try {
				ob1.t.join();
				ob2.t.join();
				ob3.t.join();
			}catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println();
			}
	}

}

class callme{
	void call(String msg) {
		System.out.println("["+msg);
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("]");
	}
}

class caller implements Runnable {

	String msg;
	callme target;
	Thread t;
	
	public caller(callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		// TODO Auto-generated method stub
		target.call(msg);
	}
	
}
