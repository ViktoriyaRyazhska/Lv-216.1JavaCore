package HomeWork5;

import java.util.Scanner;

public class RunCar {

	public static void main(String[] args) {
		Car[] car = new Car[4];
		
		car[0] = new Car("Mersedes", 2010, 2.0);
		car[1] = new Car("Volkswagen", 2012, 1.8);
		car[2] = new Car("BMV", 2000, 2.5);
		car[3] = new Car("Audi", 2012, 2.8);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter year of car");
		int car_year = s.nextInt();
		
		for(int i = 0; i < car.length; i++){
			if (car[i].getYear() == car_year) {
				System.out.println(car[i]);
			}
		}
		System.out.println();
		 
		for (int i = 0; i < car.length-1; i++){
			for (int j = i+1; j < car.length; j++){
				if (car[i].getYear()>car[j].getYear()){
					Car tmp_car = new Car();
					tmp_car = car[i];
					car[i] = car[j];
					car[j] = tmp_car;
				}
			}
		}
		
		for (Car c: car){
			System.out.println(c);
		}
		
		s.close();

	}

}
