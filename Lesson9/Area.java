package lesson9;

import java.util.Scanner;

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

public class Area {
	/*
	 * Create a method for calculating the area of a rectangle int
	 * squareRectangle (int a, int b), which should throw an exception if the
	 * user enters negative value. Input values a and b from console. Check the
	 * squareRectangle method in the method main. Check to input nonnumeric
	 * value.
	 */

	public static int calculateArea(int a, int b) throws MyException {
		if (a < 0 || b < 0) {
			throw new MyException("Size of rectangle couldn't be negative");
		}

		return a * b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input size a");
		int a = sc.nextInt();
		System.out.println("Input size b");
		int b = sc.nextInt();
		sc.close();

		try {
			System.out.println(Area.calculateArea(a, b));
		} catch (MyException e) {
			System.err.println(e.getMessage() + "\n");
			e.printStackTrace();
		}

	}
}
