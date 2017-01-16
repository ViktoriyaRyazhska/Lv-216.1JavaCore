package homeworks.day10;

class MyThread1 extends Thread {

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

public class Task3 {

    public static void main(String[] args) {
	MyThread1 one = new MyThread1();
	one.start();
    }
}