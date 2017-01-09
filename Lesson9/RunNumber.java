package lesson9;

import java.util.Scanner;

import lesson9.Number.RangeException;

public class RunNumber {
	/*
	 * Using this method write a method main(), that has to enter 10 numbers:
	 * a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two integers as the range bound");
		try {
			int start = Integer.parseInt(sc.nextLine());
			int end = Integer.parseInt(sc.nextLine());

			Number num = new Number();
			System.out.println("Input ten integers to verify the if it in the range");

			for (int i = 0; i < 10; i++) {
				try {
					System.out.println(num.readNumber(start, end, Integer.parseInt(sc.nextLine())));
				} catch (NumberFormatException e) {
					System.err.print("Error: Input parameter is not an integer or Not-a-Number" + "\n");
				} catch (RangeException e) {
					System.err.print(e.getMessage() + "\n");
				}
			}
		} catch (NumberFormatException e) {
			System.err.print("Error: Input parameter not an integer or is Not-a-Number" + "\n");
		}
		sc.close();
	}
}
