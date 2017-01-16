package homeworks.day10;

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

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

	MyThread t1 = new MyThread("Done", 1000);
	MyThread t2 = new MyThread("WellDone", 2000);

	t1.start();
	t2.start();

	t1.join();
	t2.join();

	for (int i = 0; i < 5; i++) {
	    System.out.println("I do not know what to write in this sentence");

	}
    }
}
