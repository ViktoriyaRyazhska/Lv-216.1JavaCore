package Lesson5;

import java.util.Scanner;

public class RunCar {
	/*
	 * To run class Car with fields type, year of production and engine
	 * capacity. Create and initialize four instances of class Car. Display cars
	 * certain model year (enter year in the console); ordered by the field
	 * year.
	 */

	public static void main(String[] args) {

		// Create and initialize four instances of class Car
		Car[] car = new Car[4];
		car[0] = new Car("Dodge", 1965, 3.6);
		car[1] = new Car("Ford", 2010, 5.4);
		car[2] = new Car("Crysler", 2010, 4.2);
		car[3] = new Car("Lincoln", 1965, 3.6);

		Scanner sc = new Scanner(System.in);

		// display cars certain model year (enter year in the console)
		System.out.println("Type the year of car production");
		int a = sc.nextInt();
		Car.allCarsOfCerYear(car, a);
		// display cars by the field year
		Car.arrCarByYear(car);
		sc.close();

	}

}
