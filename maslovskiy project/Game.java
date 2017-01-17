/*
* Copyright (c) Maslvoskiy Electronics, Inc.
* This software is in public access
* This  is simulation  of gameplay of monopoly with the basic scenarios
*/


package ua.com.maslovskiy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
/**
* Starting monopoly
*
* @version 1.01 16 Jan 2017
* @author Andriy Maslovskiy
*/

public class Game {
	static Scanner scn = new Scanner(System.in);
	static int dise = 0;
	static Players[] position1 = new Players[24];
	static Cities[] city = new Cities[24];

	public static void main(String[] args) {
		readTextFile();

		city[0] = new Cities(null, "START", 0, 0);
		city[3] = new Cities(null, "Chance", 0, 0);
		city[6] = new Cities(null, "Penalty", 0, 0);
		city[11] = new Cities(null, "Chance", 0, 0);
		city[12] = new Cities(null, "Lottery", 0, 0);
		city[16] = new Cities(null, "Chance", 0, 0);
		city[18] = new Cities(null, "Penalty", 0, 0);
		city[23] = new Cities(null, "Chance", 0, 0);

		int index = 0;
		int index1 = 0;
		String s = null;
		System.out.println("Input first player name ");
		Players pl1 = new Players(scn.nextLine(), 10000);
		System.out.println("Input second player name ");
		Players pl2 = new Players(scn.nextLine(), 10000);

		while (index < 24) {
			index = motion(index, pl1, pl2, s);
			index1 = motion(index1, pl2, pl1, s);

		}

	}

	private static void readTextFile() {
		
		/* method readTExtFile is reading info from file into the game */

		
		String tesxFile = "City.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(tesxFile);
			br = new BufferedReader(fr);
			for (int j = 1; j < city.length; j++) {
				String[] newCity = br.readLine().split(",");
				String price = newCity[newCity.length - 2];
				String rent = newCity[newCity.length - 1];

				city[j] = new Cities(newCity[newCity.length - 4], newCity[newCity.length - 3],
						Integer.parseInt(price.trim()), Integer.parseInt(rent.trim()));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static int motion(int index, Players p1, Players p2, String s) {
		
		/* Method motion moves the players on imaginary map monopoly*/
		Random r = new Random();

		System.out.println(p1.getName() + " throwing dice");
		String answer = scn.nextLine();

		switch (answer.toLowerCase()) {
		case "":
			int dise1 = r.nextInt(6);
			int dise2 = r.nextInt(6);
			dise = dise1 + dise2;
			if (dise < 2) {
				dise = 2;
			}
			break;
		case "no":
			break;
		default:
			break;
		}

		index = index + dise;
		if (index > 23) {
			index = index - 24;
			p1.setBalance(p1.getBalance() + 3000); //bonus after passing round

		}
		position1[index] = p1;
		System.out.println(index);

		for (int k = 0; k < city.length; k++) {
			if (k == index) {
				System.out.println(city[k].getName());
				if (p2.getName().equalsIgnoreCase(city[k].getOwner())) {
					System.out.println(p2.getName() + " already bought this city");
					System.out.println(p1.getName() + " is paying rent to " + p2.getName() + " " + city[k].getRent());
					p1.setBalance(p1.getBalance() - city[k].getRent());
					p2.setBalance(p2.getBalance() + city[k].getRent());
					System.out.println("Now " + p1.getName() + "'s balance is  : " + p1.getBalance());
					if (p1.getBalance() < 0) {
						System.err.println(p2.getName() + " is a winner !!!");
						System.err.println("Congratulation !!! ");

					}
					break;
				} else if (k == 0) {
					p1.setBalance(p1.getBalance() + 2000);
					System.out.println(p1.getName() + " your balance with bonus is : " + p1.getBalance());
					break;
				} else if (p1.getName() == city[k].getOwner()) {

					System.err.println("This city already yours");
					System.out.println(p1.getName() + " your balance is : " + p1.getBalance());
					break;

				} else if (k == 12) {

					System.out.println("Congratulations , you won " + 500);
					p1.setBalance(p1.getBalance() + 500);
					System.out.println(p1.getName() + " your balance after lottery is : " + p1.getBalance());
					break;
				} else if (k == 6 || k == 18) {
					int penalty = penalty();
					System.out.println("Unfortunately you lost " + penalty);
					p1.setBalance(p1.getBalance() - penalty());
					System.out.println(p1.getName() + " your balance after penalty is : " + p1.getBalance());
					break;
				} else if ((k == 3) || (k == 11) || (k == 16) || (k == 23)) {

					int chance = r.nextInt(4);
					switch (chance) {
					case 0:
						int penalty = penalty();
						System.out.println("Unfortunately you lost " + penalty);
						p1.setBalance(p1.getBalance() - penalty());
						System.out.println(p1.getName() + " your balance after chance is : " + p1.getBalance());
						break;
					case 1:
						System.out.println(p1.getName() + " you have been moved in 5 positions");
						index = index + 5;
						return index;
					case 2:
						int win = penalty();
						System.out.println("Congratulations , you won " + win);
						p1.setBalance(p1.getBalance() + win);
						System.out.println(p1.getName() + " your balance after lottery is : " + p1.getBalance());
						break;
					default:
						System.out.println(p1.getName() + " you have been moved to the start");
						index = 0;
						return index;
					}
					break;
				}

				System.out.println("Do you want to buy " + city[k].getName() + " for " + city[k].getPrice());
				String buyCity = scn.nextLine();

				switch (buyCity.toLowerCase()) {
				case "yes":

					if (p1.getBalance() < city[k].getPrice()) {
						System.out.println("You don't have enough money");
						break;
					}
					city[k].setOwner(p1.getName());
					p1.setBalance(p1.getBalance() - city[k].getPrice());
					System.out.println(p1.getName() + " your balance is : " + p1.getBalance());
					break;
				default:
					System.out.println(p1.getName() + " your balance is : " + p1.getBalance());
					break;
				}
			}

		}

		return index;

	}

	private static int penalty() {
		/*This method generates penalty	*/
		Random r = new Random();
		int penalty = r.nextInt(4);
		switch (penalty) {
		case 0:
			return 500;
		case 1:
			return 800;
		case 2:
			return 1000;
		default:
			return 1500;
		}

	}

}
