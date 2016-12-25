package task3;

import java.util.Scanner;

public class FiveIntegers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];

		/* Filling array */

		System.out.println("Enter 5 numbers : ");
		int index = 0;
		int endFillig = 0;

		do {
			data[index] = sc.nextInt();
			index++;
		} while (++endFillig < data.length);
		sc.close();

		/* Display enter data */

		for (int i : data) {
			System.out.print(i + "  ");
		}

		/* Find first positive number and it position */

		int positivePos = 0;
		int minPosition = 0;
		for (int j = 0; j < data.length; j++) {
			if (data[j] > 0) {
				positivePos = j;
				break;
			}
		}

		/* Find second positive number and it position */

		for (int i = positivePos; i < data.length; i++) {
			if (data[i + 1] > 0) {
				positivePos = i;
				break;
			}
		}

		/* Find minimum number and position of this number */

		int minNumber = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < minNumber) {
				minNumber = data[i];
				minPosition = i;
			}
		}

		System.out.println();
		System.out.println("Position of second positive number  :" + (positivePos + 1));
		System.out.println("The minimum number : " + minNumber);
		System.out.println("Position of min number : " + (minPosition + 1));

	}
}
