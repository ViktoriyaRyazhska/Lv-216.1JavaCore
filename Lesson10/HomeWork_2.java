package lesson10;

public class HomeWork_2 {
	final static Object first = new Object();
	/*
	 * Cause a deadlock. Organize the expectations of ending a thread in main(),
	 * and make the end of the method main() in this thread.
	 */

	public static void main(String[] args) {
		synchronized (first) {
			Thread t1 = new Thread() {
				public void run() {
					synchronized (first) {
						for (int i = 0; i < 5; i++) {
							System.out.println("Hello, world");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}
			};

			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main thread");
		}
	}
}
