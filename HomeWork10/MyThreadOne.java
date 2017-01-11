package HomeWork10;

public class MyThreadOne extends Thread {
	Thread t;

	public MyThreadOne() {
		System.out.println("MyThreadOne create");

		}

	public void run() {
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyThreadOne finished");
		}
	
	public void setMyThread(Thread t) {
		this.t = t;
	}
}
