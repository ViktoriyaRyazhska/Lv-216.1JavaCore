package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideMethod {

	public static void main(String[] args) {

		/*
		 * Create method div(), which calculates the dividing of two double
		 * numbers. In main method input 2 double numbers and call this method.
		 * Catch all exceptions.
		 * 
		 */

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input two double :");
		double result = 0;

		try {
			double d1 = Double.parseDouble(bReader.readLine());
			double d2 = Double.parseDouble(bReader.readLine());

			result = div(d1, d2);

			System.out.printf("Result :" + "%.2f", result);

		} catch (IOException | NumberFormatException e) {
			System.err.println("Incorect input data , expected double precision");
		} catch (ArithmeticException e) {
			System.err.println("Dividing on zero");
		}

	}

	public static double div(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}

}
