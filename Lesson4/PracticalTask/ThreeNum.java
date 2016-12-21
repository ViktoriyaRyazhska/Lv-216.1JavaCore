package Lesson4;

import java.util.Scanner;

public class ThreeNum {

	public static void main(String[] args) {

		int a, b, c;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Type three digits");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a % 2 != 0) {
			count++;
		}
		if (b % 2 != 0) {
			count++;
		}
		if (c % 2 != 0) {
			count++;
		}

		System.out.println(count + " digit(s) is(are) odd");

	}

}
