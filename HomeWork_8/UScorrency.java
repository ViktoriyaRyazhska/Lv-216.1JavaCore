package task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UScorrency {

	public static void main(String[] args) {

		/*
		 * Implement a pattern for US currency: the first symbol "$", then any
		 * number of digits, dot and two digits after the dot. Enter the text
		 * from the console that contains several occurrences of US currency.
		 * Display all occurrences on the screen.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers :");

		int count = 0;
		do {
			if (checkWhithRegExp(scanner.nextLine())) {
				System.out.println("The data is correct");
			} else {
				System.out.println("The data is not correct " + " expected $ _ _ . _ _");

			}

		} while (++count < 4);
		scanner.close();
	}

	public static boolean checkWhithRegExp(String input) {
		Pattern pattern = Pattern.compile("\\$\\d+\\.(\\d){1,2}");
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {

			return true;
		}
		return false;

	}

}
