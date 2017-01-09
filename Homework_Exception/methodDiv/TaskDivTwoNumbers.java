package methodDiv;

import java.util.Scanner;

public class TaskDivTwoNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();

		System.out.println(div(a, b));

	}

	private static double div(double a, double b) {
		double result = 0;
		try {
			result = div(a, b);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return result;
	}
}
