package threads;

public class Isaliveandjointhread implements Runnable {
			String name;
		Thread t;
		 Isaliveandjointhread(String tname) {
			// TODO Auto-generated constructor stub
			name = tname;
			t = new Thread(this, name);
			System.out.println("Child thread 1 -"+t);
			t.start();
		}

		public void run() {
			// TODO Auto-generated method stub
			
			try {
				for (int i = 5; i >0 ; i--) {
					System.out.println(name+  "-"+i);
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Child thread interrupted");
			}
			System.out.println("Exit of child "+name);
			
		}
		

	}



