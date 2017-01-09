package lesson9;

import lesson9.Plants.ColorException;
import lesson9.Plants.TypeException;

public class RunPlants {
	/*
	 * In the method main create an array of five plants. Check to work your
	 * exceptions.
	 */

	public static void main(String[] args) {

		Plants[] plant = new Plants[5];

		try {
			plant[0] = new Plants("Rose", "white", 150);
			plant[1] = new Plants("fjdjfd", "1125", 150);
			plant[2] = new Plants("hdshd", "dsdsd", 150);
			plant[3] = new Plants("chamomile", "blue", 125);
			plant[4] = new Plants("marguerite", "red", 115);

		} catch (TypeException | ColorException e) {
			System.err.println(e.getMessage() + "\n");
			e.printStackTrace();
		}
		for (Plants pl : plant) {
			System.out.println(pl);
		}
	}

}
