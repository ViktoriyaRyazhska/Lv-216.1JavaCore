package ua.bilas2;

public class Main {

	public static void main(String[] args) {
	
		Thread one = new Thread(new RunOne());
		Thread two = new Thread(new RunTwo());
		
		one.start();
		two.start();
		
		System.out.println("my name is Oleg");
	}
}
