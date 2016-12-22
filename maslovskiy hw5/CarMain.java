package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Car []car = new Car[4];
		Scanner scn = new Scanner(System.in);
		
		car[0] = new Car("Hatchback",2008,1.5 );
		car[1] = new Car("Sedan",2008,2.0 );
		car[2] = new Car("Crossover",2008,1.9 );
		car[3] = new Car("Minivan",2009,2.3 );
		
		modelSearchByYear(car, scn);
		sort1(car);
	}

	private static void sort1(Car[] car) {
		Car tmp;
		for(int i = 0; i < car.length-1;i++){					
			for(int j = i + 1; j < car.length;j++){			
				if(car[i].getYear() < car[j].getYear()){
					tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				}
			}
		}
		System.out.println("Sort : " + Arrays.toString(car));
		
	}

	private static void modelSearchByYear(Car[] car, Scanner scn) {
		System.out.println("Input year");
		int year = Integer.parseInt(scn.nextLine());
		
		for(int i = 0;i<car.length;i++){
			if(car[i].getYear()==year){
				System.out.println(car[i]);
			}
		}
		
	}
}


