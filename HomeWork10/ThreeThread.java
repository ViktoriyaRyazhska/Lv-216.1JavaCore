package HomeWork10;

public class ThreeThread {

	public static void main(String[] args) {
		MyThreadOne t1 = new MyThreadOne();
		MyThreadTwo t2 = new MyThreadTwo();
		MyThreadThree t3 = new MyThreadThree();
		t1.setMyThread(t2);
		t2.setMyThread(t3);
		t1.start();
		
		
		
	}

}
