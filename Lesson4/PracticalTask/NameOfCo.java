package Lesson4;

import java.util.Scanner;

enum Continent {
	Eurasia, North_America, South_America, Africa, Australia
}

public class NameOfCo {

	public static void main(String[] args) {

		String country;

		Scanner sc = new Scanner(System.in);

		System.out.println("Type name of country");

		country = sc.next();

		switch (country.toLowerCase()) {
		case "ukraine":
		case "finland":
		case "france":
		case "croatia":
		case "spain":
		case "china":
			System.out.println(Continent.Eurasia);
			break;
		case "usa":
		case "canada":
		case "mexico":
			System.out.println(Continent.North_America);
			break;
		case "brazil":
		case "uruguay":
		case "paraguay":
		case "argentina":
		case "venezuela":
		case "chile":
			System.out.println(Continent.South_America);
			break;
		case "australia":
			System.out.println(Continent.Australia);
			break;
		case "angola":
		case "somalia":
		case "tunisia":
		case "eritrea":
		case "gabon":
		case "ethiopia":	
			System.out.println(Continent.Africa);
			break;
		default:
			System.out.println("Type correct name of country");
			break;	

		}
	}

}
