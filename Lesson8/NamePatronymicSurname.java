package lesson8;

import java.util.Scanner;

public class NamePatronymicSurname {
	/*
	 * Enter surname, name and patronymic on the console as a variable of type
	 * String. Output on the console: surnames and initials name name, middle
	 * name and last name
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the full name as : 'surname, name and patronymic'");
		String fullName = new String(sc.nextLine());
		String[] names = fullName.split(" ");

		System.out.println(names[0] + " " + names[1].substring(0, 1) + "." + " " + names[2].substring(0, 1) + ".");
		System.out.println(names[2] + " " + names[0]);

		sc.close();

	}

}
