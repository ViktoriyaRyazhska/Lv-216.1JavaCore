package Lesson5;

public class Car {
	/*
	 * Create class Car with fields type, year of production and engine
	 * capacity. Create and initialize four instances of class Car. Display cars
	 * certain model year (enter year in the console); ordered by the field
	 * year.
	 */

	// fields type, year of production and engine capacity
	private String type;
	private int yearOfProd;
	private double engCap;

	// getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfProd() {
		return yearOfProd;
	}

	public void setYearOfProd(int yearOfProd) {
		this.yearOfProd = yearOfProd;
	}

	public double getEngCap() {
		return engCap;
	}

	public void setEngCap(double engCap) {
		this.engCap = engCap;
	}

	// constructor with three parameters
	public Car(String type, int yearOfProd, double engCap) {
		setType(type);
		setYearOfProd(yearOfProd);
		setEngCap(engCap);
	}

	// method to display cars certain model year (enter year in the console)
	public static void allCarsOfCerYear(Object obj[], int a) {
		System.out.println("The list of cars after year of production " + a
				+ " below");
		for (int i = 0; i < obj.length; i++) {
			if (((Car) obj[i]).getYearOfProd() == a) {
				System.out.println("Car [type " + ((Car) obj[i]).getType()
						+ "," + " engine capacity = "
						+ ((Car) obj[i]).getEngCap() + "]");
			}
		}

	}

	// method to arrange and display cars by the field year
	public static void arrCarByYear(Object obj[]) {
		System.out
				.println("The list of all cars ordered by the field year below");
		Car temp;
		for (int i = 0; i < obj.length - 1; i++) {
			for (int j = i + 1; j < obj.length; j++) {
				if (((Car) obj[j]).getYearOfProd() < ((Car) obj[i])
						.getYearOfProd()) {
					temp = (Car) obj[i];
					obj[i] = obj[j];
					obj[j] = temp;
				}
			}
		}
		for (int i = 0; i < obj.length; i++) {
			System.out.println("Car [type " + ((Car) obj[i]).getType() + ","
					+ " year of production " + ((Car) obj[i]).getYearOfProd()
					+ "," + " engine capacity = " + ((Car) obj[i]).getEngCap()
					+ "]");
		}

	}

}
