package homework10;

public class String1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++)
			try {
				Thread.sleep(1000);
				System.out.println("String1");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
