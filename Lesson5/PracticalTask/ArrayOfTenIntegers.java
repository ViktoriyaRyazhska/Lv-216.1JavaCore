package Lesson5;

public class ArrayOfTenIntegers {

	public static void main(String[] args) {
		// Create an array of ten integers
		int[] array = { -5, 12, 25, -32, 10, -7, 8, 13, -5, 11 };

		// display the biggest of these numbers
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The biggest number is " + max);

		// display the sum of positive numbers in the array
		int sumPos = 0;
		for (int i : array) {
			if (i > 0) {
				sumPos += i;
			}
		}
		System.out.println("The sum of positive numbers is " + sumPos);

		// display the amount of negative numbers in the array
		int amountPos = 0;
		int amountNeg = 0;
		for (int i : array) {
			if (i > 0) {
				amountPos++;
			}
			if (i < 0) {
				amountNeg++;
			}
		}
		System.out.println("The amount of negative numbers in the array is "
				+ amountNeg);

		// display what values there are more: negative or positive
		if (amountNeg > amountPos) {
			System.out.println("The negative values are more than positive");
		} else {
			System.out.println("The negative values are less than positive");
		}

	}
}
