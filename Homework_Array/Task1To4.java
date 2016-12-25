package homework;

import java.util.Scanner;

public class Task1To4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("   Task ¹ 1   ");
		System.out.print("Enter the number month: ");
		int array_month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int numberMonth = input.nextInt();
		System.out.println("The amount of days in this month - " + array_month[numberMonth - 1] + ";");
		//
		/* TASK ¹ 2 */
		//
		System.out.println("   Task ¹ 2   ");
		System.out.println("Enter 10 integer numbers");
		int number = 0;
		int sumNumberInArray = 0;
		int productNumberInArray = 1;
		int ArrayIntNumber[] = new int[10];
		while (number <= 9) {
			ArrayIntNumber[number] = input.nextInt();
			number++;
		}

		for (int n = 0; n < 5; n++) {
			if (ArrayIntNumber[n] > 0) {
				sumNumberInArray += ArrayIntNumber[n];
			} else {
				sumNumberInArray = 0;
				break;
			}
		}
		if (sumNumberInArray == 0) {

			for (int n = 5; n < 10; n++) {
				productNumberInArray *= ArrayIntNumber[n];
			}
		}
		if (sumNumberInArray != 0) {
			System.out.println("Sum first 5 pozitive numbers: " + sumNumberInArray + ";");
		} else {
			System.out.println("Product 5 next numbers: " + productNumberInArray + ";");
		}
		//
		/* TASK ¹ 3 */
		//
		int indexMin = 0;
		int account = 0;
		int NumberToTaskTwo[] = new int[5];
		System.out.println("   Task ¹ 3   ");
		System.out.println("Enter 5 number integer");
		for (int n = 0; n < 5; n++) {
			NumberToTaskTwo[n] = input.nextInt();
		}
		int min = NumberToTaskTwo[0];
		for (int n = 0; n < 5; n++) {
			if (NumberToTaskTwo[n] > 0) {
				account++;
			}
			if (NumberToTaskTwo[n] > 0 && account == 2)
				System.out.println("Position of second positive number: " + n);

			if (NumberToTaskTwo[n] < min) {
				min = NumberToTaskTwo[n];
				indexMin = n;
			}
		}
		System.out.println("Minimum and its position in the array:");
		System.out.println("min_number: " + min + ", pos_min_number: " + indexMin);
		//
		/* TASK ¹ 4 */
		//
		System.out.println("   Task ¹ 4   ");
		int numberTaskFour = 0;
		int UntilFirstNegNumber = 0;
		int productAllPositiveEvenNumber = 1;
		System.out.println("Enter number");
		while ((UntilFirstNegNumber = input.nextInt()) > 0) {
			System.out.println("Enter next number:");
			if (UntilFirstNegNumber % 2 != 1) {
				productAllPositiveEvenNumber *= UntilFirstNegNumber;
			}
		}
		System.out.println("You entered negative number");
		System.out.println("Product = " + productAllPositiveEvenNumber);
	}
}
