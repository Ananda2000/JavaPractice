//using the synchronization methods...

package threads;

public class Synch2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

			callme1 target = new callme1();
			caller1 ob1 = new caller1(target, "Hello");
			caller1 ob2 = new caller1(target, "good morning");
			caller1 ob3 = new caller1(target, "Anand");
			
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

class  callme1{
	synchronized void call(String msg) {
		System.out.print("["+msg);
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("]");
	}
}

class caller1 implements Runnable {

	String msg;
	callme1 target;
	Thread t;
	
	public caller1(callme1 target2, String s) {
		target = target2;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		// TODO Auto-generated method stub
		target.call(msg);
	}
}
	


