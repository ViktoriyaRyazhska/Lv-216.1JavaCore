package ua.bilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomeLogic {

	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public static void daysInTheMonth() throws NumberFormatException, IOException {

		int[] monthes = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 31 };

		System.out.println("add month number:");
		int monthNum = Integer.parseInt(bufferedReader.readLine()) - 1;

		if (monthNum >= 0 && monthNum < 12) {
			System.out.println("Your month has " + monthes[monthNum] + " days");
		} else {
			System.out.println("Wrong Month number!");
		}

	}

	public static void integerNumsSumOrProduct() throws NumberFormatException, IOException {

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			System.out.println("add num:");
			nums[i] = Integer.parseInt(bufferedReader.readLine());
		}

		for (int i : nums) {
			System.out.print(i + " ");
		}

		System.out.println();

		int sum = 0;
		int product = 1;
		int count = 0;
		for (int j = 0; j < nums.length / 2; j++) {
			if (nums[j] > 0) {
				sum += nums[j];
				count++;
			} else {
				for (int k = nums.length - 1; k > nums.length / 2; k--) {
					product *= nums[k];
				}
				System.out.println("product is " + product);
			}
		}
		if (count == 5) {
			System.out.println("sum is " + sum);	
		}

	}
	
	public static void position() throws NumberFormatException, IOException {
		
		int[] nums = new int[5];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("add num:");
			nums[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		int position = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				position = i;
				count++;
				if (count == 2) {
					break;
				}
			}
		}
		System.out.println("position of second positive number " + position);
		
		int min = nums[0];
		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
		
			if (nums[i] < min) {
				min = nums[i];
				position = i;
			}
		}
		System.out.println("minimum " + min + " and its position in the array: " + pos);
	}
	
	public static void enterInt() throws NumberFormatException, IOException {
		int product = 1;
		int num;
		do {
			System.out.println("add num:");
			num = Integer.parseInt(bufferedReader.readLine());
			if (num % 2 == 0) {
				product *= num;
			}
		} while (num >= 0);
		System.out.println("Product is " + product);
	}

}
