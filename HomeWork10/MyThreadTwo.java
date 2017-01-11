package HomeWork10;

public class MyThreadTwo extends Thread {
	Thread t;

	public MyThreadTwo() {
		System.out.println("MyThreadTwo create");

	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyThreadTwo finished");
	}

	public void setMyThread(Thread t) {
		this.t = t;
	}
}
