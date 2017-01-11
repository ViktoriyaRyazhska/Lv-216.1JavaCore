package homework10;

public class Task3 {

	public static void main(String[] args) {
		Runnable r1 = new One();
		Thread t1 = new Thread(r1);
		t1.start();
	}

}

class One implements Runnable {

	@Override
	public void run() {

		Runnable r2 = new Two();
		Thread t2 = new Thread(r2);
		t2.start();
		Thread.yield();

	}

}

class Two implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");

		}

		Runnable r3 = new Three();
		Thread t3 = new Thread(r3);
		t3.start();
	}

}

class Three implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {

			System.out.println("Thread number three");

		}
	}

}
