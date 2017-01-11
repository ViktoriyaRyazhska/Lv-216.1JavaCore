package HomeWork10;

public class MyThread extends Thread {
	Thread t2;

	public MyThread() {
		System.out.println("MyThread create");

		}

	public void run() {
		System.out.println("MyThread start");
		try {
		sleep(1000);
		} catch (Exception e) {
		}
		try {
		System.out.println("MyThreadOne waiting MainThread finish…");
		t2.join();

		} catch (Exception e)
		{e.printStackTrace();}
		System.out.println("MyThread finished");
		}
	
	public void setMyThread(Thread t) {
		this.t2 = t;
	}

}
