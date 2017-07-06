package Lesson5;

import java.util.Scanner;

public class HomeWork_1 {
	/*
	 * Ask user to enter the number of month. Read the value and write the
	 * amount of days in this month (create array with amount days of each
	 * month).
	 */

	public static void main(String[] args) {
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the number of month");
		int a = sc.nextInt();
		System.out.println("Month #" + a + " has " + daysInMonth[a - 1] + " days");
		sc.close();
		

	}

}
