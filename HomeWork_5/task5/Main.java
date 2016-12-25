package task5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Car[] car = new Car[4];
		car[0] = new Car("Toyota", 2009, 3.2);
		car[1] = new Car("Suzuki", 2010, 2.5);
		car[2] = new Car("Shkoda", 2016, 1.6);
		car[3] = new Car("Mersedes", 2011, 2.4);

		
		System.out.println("Set the year production :");
		Scanner sc = new Scanner(System.in);
		int yearEnter = sc.nextInt();
		for (int i = 0; i < car.length; i++) {
			if (car[i].getYearProduction() == yearEnter) {
				System.out.println(car[i]);
			}
		}
		sc.close();
		
		/* sorted car by year of production */
		
		Car tmpCar = new Car();
				
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYearProduction() < car[j].getYearProduction()) {
					tmpCar = car[i];
					car[i] = car[j];
					car[j] = tmpCar;
				}
			}
		}

		/*show cars sorted  by year*/
		System.out.println("List of sorted cars by year production");
		for (Car cars : car) {
			System.out.println(cars);
		}

	}

}
