package ua.bilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		
//		SomeLogic.daysInTheMonth();
//		SomeLogic.position();
//		SomeLogic.enterInt();
		
		System.out.println("how many cars do you want?");
		int c = Integer.parseInt(bufferedReader.readLine());
		
		Car[] cars = Car.carsArray(c);
		
		Car.sortCars(cars);
		
		
	}

}
