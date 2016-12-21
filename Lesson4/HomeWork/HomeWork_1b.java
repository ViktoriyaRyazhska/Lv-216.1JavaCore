package Lesson4;

import java.util.Scanner;

public class HomeWork_1b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// read 3 integer numbers and write max and min of them
		System.out.println("Type three ints");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = (a >= b && a >= c) ? a : (b >= c && b >= a) ? b : c;
		System.out.println("Max value " + max);

		int min = (a <= b && a <= c) ? a : (b <= c && b <= a) ? b : c;
		System.out.println("Min value " + min);

	}
}
