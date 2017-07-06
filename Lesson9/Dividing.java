package lesson9;

import java.util.Scanner;

public class Dividing {
	/*
	 * Create method div(), which calculates the dividing of two double numbers.
	 * In main method input 2 double numbers and call this method. Catch all
	 * exceptions.
	 */
	public static double div(Double a, Double b) {
		if (b == 0) {
			throw new ArithmeticException("Error: Division by Zero");
		}
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two doubles");

		try {
			Double a = Double.parseDouble(sc.next());
			Double b = Double.parseDouble(sc.next());
			System.out.printf(a + "/" + b + " = " + "%.2f\n", div(a, b));

		} catch (NumberFormatException e) {
			System.err.print("Error: Input parameter is Not-a-Number or used wrong punctuation" + "\n");
		} catch (ArithmeticException e) {
			System.err.print(e.getMessage() + "\n");
		}
		sc.close();
	}
}
