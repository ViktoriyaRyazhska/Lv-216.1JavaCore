package HomeWork10;

public class DeadLock {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
	
		System.out.println("Main start");
		
		t1.setMyThread(Thread.currentThread());
		t1.start();
		t1.join();
	}
}

