package Lesson5;

import java.util.Scanner;

public class HomeWork_2 {
	/*
	 * Enter 10 integer numbers. Calculate the sum of first 5 elements if they
	 * are positive or product of last 5 element in the other case.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] tenNum = new int[10];
		int sumFirstFivePos = 0;
		int prodLastFiveNeg = 1;

		System.out.println("Type ten numbers");
		for (int i = 0; i < tenNum.length; i++) {
			tenNum[i] = sc.nextInt();
			if (tenNum[i] > 0 && i < 5) {
				sumFirstFivePos += tenNum[i];
			} else if (i >= 5) {
				prodLastFiveNeg *= tenNum[i];
			}
		}
		if (sumFirstFivePos > 0) {
			System.out
					.println("Sum of first 5 elements if they are positive = "
							+ sumFirstFivePos);
		} else {
			System.out
					.println("Product of last 5 element if first five are negative = "
							+ prodLastFiveNeg);
		}
		sc.close();

	}

}
