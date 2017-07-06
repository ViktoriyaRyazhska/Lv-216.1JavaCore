package Lesson5;

import java.util.Scanner;

public class HomeWork_3 {
	/*
	 * Enter 5 integer numbers. Find position of second positive number; minimum
	 * and its position in the array.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] fiveNum = new int[5];
		int count = 0;
		int pos = 0;
		int min = 0;
		int posMin = 0;

		System.out.println("Type five numbers");
		for (int i = 0; i < fiveNum.length; i++) {
			fiveNum[i] = sc.nextInt();
			if (fiveNum[i] > 0) {
				count++;
				if (count == 2) {
					pos = i + 1;
				}
			}
		}

		min = fiveNum[0];
		for (int j = 0; j < fiveNum.length; j++) {
			if (fiveNum[j] <= min) {
				min = fiveNum[j];
				posMin = j + 1;
			}

		}
		if (count > 1) {
			System.out.println("Position of second positive number is " + pos);
		} else {
			System.out.println("There is no second positive number in array");
		}
		System.out.println("minimum of array numbers is " + min
				+ " and its position in the array is " + posMin);
		sc.close();
	}
}
