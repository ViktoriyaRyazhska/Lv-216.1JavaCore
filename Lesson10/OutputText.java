package lesson10;

public class OutputText {
	/*
	 * Output text «I study Java» 10 times with the intervals of one second
	 * (Thread.sleep(1000);).
	 */

	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("I study Java");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
	}
}
