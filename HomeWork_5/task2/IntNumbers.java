package task2;

import java.util.Scanner;

public class IntNumbers {

	public static void main(String[] args) {

		int[] arrTenNumber = new int[10];
		Scanner sc = new Scanner(System.in);

		// Filling an array
		System.out.println("Enter numbers to array  : ");

		int index = 0;
		int end = 0;

		do {
			arrTenNumber[index] = sc.nextInt();
			index++;

		} while (++end < 10);
		sc.close();

		int sumPositive = 0;
		int prodNegative = 1;
		int barrier = 0;

		for (int i = 0; i < arrTenNumber.length; i++) {
			if (arrTenNumber[i] > 0 && arrTenNumber.length / 2 > barrier) {
				sumPositive += arrTenNumber[i];
				barrier++;
			} else if (i >= 5) {
				prodNegative *= arrTenNumber[i];

			}
		}

		if (sumPositive > 0) {
			System.out.println("Total positive elements : " + sumPositive);
		} else
			System.out.println("Product last 5  elements : " + prodNegative);

	}
}
