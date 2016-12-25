package ua.bilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {

	private String type;
	private int yearOfProduction;
	private double engineCapacity;

	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String type, int yearOfProduction, double engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(engineCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + yearOfProduction;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Double.doubleToLongBits(engineCapacity) != Double.doubleToLongBits(other.engineCapacity))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (yearOfProduction != other.yearOfProduction)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}

	public static Car[] carsArray(int length) throws IOException {
		Car[] cars = new Car[length];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
			System.out.println("add type:");
			cars[i].setType(bufferedReader.readLine());
			System.out.println("add year of production:");
			cars[i].setYearOfProduction(Integer.parseInt(bufferedReader.readLine()));
			System.out.println("add engine capacity:");
			cars[i].setEngineCapacity(Double.parseDouble(bufferedReader.readLine()));

		}
		return cars;
	}

	public static void sortCars(Car[] cars) throws NumberFormatException, IOException {
		System.out.println("add year of car production:");

		int year = Integer.parseInt(bufferedReader.readLine());

		System.out.println();
		Car tmp;
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
					tmp = cars[i];
					cars[i] = cars[j];
					cars[j] = tmp;
				}
			}
			
		}
		System.out.println();

		for (Car car : cars) {
			if (year == car.getYearOfProduction()) {
				System.out.println(car);
			}
		}
		System.out.println();
		
		System.out.println("sorted cars:");
		for (Car car : cars) {
			System.out.println(car);
		}
	}

}
