package HomeWork10;

public class RunThread {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new FirstThread(1, 500);
		Thread t2 = new FirstThread(2, 1000);
		Thread t3 = new FirstThread(3, 500);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t3.start();
		
	}

}
