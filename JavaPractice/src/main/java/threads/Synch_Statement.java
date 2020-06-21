//threads example by  using synchronized statement...
	
package threads;

public class Synch_Statement {
	
	
	
		
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

	class callme2{
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

	class caller3 implements Runnable {

		String msg;
		callme2 target;
		Thread t;
		
		public caller3(callme2 targ, String s) {
			target = targ;
			msg = s;
			t = new Thread(this);
			t.start();
		}
		public void run() {
			// TODO Auto-generated method stub
			synchronized (target) {
				target.call(msg);
			}
			
		}
		
	}


