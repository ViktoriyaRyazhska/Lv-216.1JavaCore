package lesson10;

class MyThread extends Thread {
	String message;
	int pause;

	public MyThread(String message, int pause) {
		this.message = message;
		this.pause = pause;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(message);
			try {
				Thread.sleep(pause);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class HomeWork_1 {
	/*
	 * Run three threads and output there different messages for 5 times. The
	 * third thread supposed to start after finishing working of the two
	 * previous threads.
	 */

	public static void main(String[] args) {

		MyThread t1 = new MyThread("Thread 1 executing", 2000);
		MyThread t2 = new MyThread("Thread 2 executing", 3000);

		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Thread 3(main) executing");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
