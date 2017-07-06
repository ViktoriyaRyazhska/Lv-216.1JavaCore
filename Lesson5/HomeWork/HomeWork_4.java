package Lesson5;

import java.util.Scanner;

public class HomeWork_4 {
	/*
	 * Organize entering integers until the first negative number. Count the
	 * product of all entered even numbers.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prod = 1;
		int a;
		System.out.println("Type an number");
		do {
			a = sc.nextInt();
			if (a < 0) {
				break;
			}
			prod *= a;
		} while (a > 0);
		System.out.println("Product of all entered = " + prod);
		sc.close();

	}

}
