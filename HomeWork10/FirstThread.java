package HomeWork10;

public class FirstThread extends Thread {
	private int pause;
	private int numThread;

	public FirstThread(int numThread, int pause) {
		this.numThread = numThread;
		this.pause = pause;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(pause);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread ¹" +numThread);
		}
	}


}
