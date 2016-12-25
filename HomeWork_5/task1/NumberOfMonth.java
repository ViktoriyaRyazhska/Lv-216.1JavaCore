package task1;

import java.util.Scanner;

public class NumberOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Enter the number of the month :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("The month : " + number + " has a ");
		System.out.print(monthDays[number - 1]);
		sc.close();

	}

}
