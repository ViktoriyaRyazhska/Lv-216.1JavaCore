package homework10;

public class String2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++)
			try {
				Thread.sleep(2000);
				System.out.println("String2");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}
