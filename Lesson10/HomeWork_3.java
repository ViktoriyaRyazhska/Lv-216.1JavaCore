package lesson10;

class MyThread_1 extends Thread {

	public void run() {
		Thread two = new Thread() {
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Thread number two");
				}
				Thread three = new Thread() {
					public void run() {
						for (int i = 0; i < 5; i++) {
							System.out.println("Thread number three");
						}
					}
				};
				three.start();
			}
		};
		two.start();
	}
}

public class HomeWork_3 {
	/*
	 * Create a thread «one», which would start the thread «two», which has to
	 * output its number («Thread number two») 3 times and create thread
	 * «three», which would to output message «Thread number three» 5 times.
	 */

	public static void main(String[] args) {
		MyThread_1 one = new MyThread_1();
		one.start();
	}
}
