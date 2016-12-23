package Lesson4;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		int dayOfWeek;

		Scanner sc = new Scanner(System.in);

		System.out.println("Type Day of Week");

		dayOfWeek = sc.nextInt();

		switch (dayOfWeek) {
		case 1:
			System.out.println("Íä/Sun/Âñ");
			break;
		case 2:
			System.out.println("Ïí/Mon/Ïí");
			break;
		case 3:
			System.out.println("Âò/Tue/Âò");
			break;
		case 4:
			System.out.println("Ñğ/Wed/Ñğ");
			break;
		case 5:
			System.out.println("×ò/Thr/×ò");
			break;
		case 6:
			System.out.println("Ïò/Fri/Ïò");
			break;
		case 7:
			System.out.println("Ñá/Sat/Ñá");
			break;
		default:
			System.out.println("Type number of day 1...7");
			break;

		}

	}

}

