package homework;

import java.util.Scanner;

public class Car {
	private String type;
	private int yearOfProduction;
	private double engineCapacity;

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

	public Car(String type, int yearOfProduction, double engineCapacity) {

		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Car car1[] = new Car[4];
		car1[0] = new Car("Mazda_Rx", 2013, 2.0);
		car1[1] = new Car("Mazda_ZCD", 2008, 2.0);
		car1[2] = new Car("Mazda_M3", 2002, 2.4);
		car1[3] = new Car("Mazda_M6", 2013, 1.6);
		System.out.print("Enter the year of production:");
		int variableYearCar = input.nextInt();
		for (int i = 0; i < 4; i++) {
			if (car1[i].yearOfProduction == variableYearCar) {
				System.out.println(car1[i].type);
			} 
		}
		Car tmp= null;
		for (int i = 0; i < car1.length - 1; i++) {
			for (int j = i + 1; j < car1.length; j++) {
				if (car1[i].getYearOfProduction() < car1[j].getYearOfProduction()) 
				{
					tmp = car1[i];
					car1[i] = car1[j];
					car1[j]= tmp;
				}
			}
		}
		System.out.println("Sorting cars");
		for (int i = 0; i < car1.length; i++) {
			System.out.println(car1[i].getType());
		}
input.close();
		
	}

}
