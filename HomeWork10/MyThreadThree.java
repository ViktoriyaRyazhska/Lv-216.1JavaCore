package HomeWork10;

public class MyThreadThree extends Thread {

	public MyThreadThree() {
		System.out.println("MyThreadThree create");

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread number three");
		}
		System.out.println("MyThreadThree finished");
	}

}
