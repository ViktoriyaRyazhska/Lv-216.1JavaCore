package homeworks.day5;

import java.util.Scanner;

import task2.Employee;

public class CarMain {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Car[] cars = new Car[4];
	cars[0] = new Car("Sedan", 2016, 1600);
	cars[1] = new Car("Universal", 2014, 1800);
	cars[2] = new Car("Wagon", 2011, 2200);
	cars[3] = new Car("Sedan", 2016, 1800);

	System.out.println("Enter year of production");
	int n = sc.nextInt();
	for (int i = 0; i < cars.length; i++) {
	    if (n == cars[i].getYear()) {
		System.out.println(cars[i]);
	    }
	}
	System.out.println();
	System.out.println("Cars odered by field year");

	Car temp;
	for (int i = 0; i < cars.length - 1; i++) {
	    for (int j = i + 1; j < cars.length; j++) {
		if (cars[i].getYear() < cars[j].getYear()) {
		    temp = cars[i];
		    cars[i] = cars[j];
		    cars[j] = temp;
		}
	    }
	}
	for (int i = 0; i < cars.length; i++) {
	    System.out.println(cars[i]);
	}
    }

}
