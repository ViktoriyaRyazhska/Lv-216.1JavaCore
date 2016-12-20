package ua.bilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyLogic {

	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	
	public int numOfOdds() throws NumberFormatException, IOException {
		
		int count = 0;
		

		System.out.println("add first num:");
		int one = Integer.parseInt(bufferedReader.readLine());

		System.out.println("add second num:");
		int two = Integer.parseInt(bufferedReader.readLine());

		System.out.println("add second num:");
		int three = Integer.parseInt(bufferedReader.readLine());

		if (one % 2 != 0) {
			count++;
		}
		if (two % 2 != 0) {
			count++;
		}
		if (three % 2 != 0) {
			count++;
		}

		System.out.println("there are " + count + " odd num(s)");

		System.out.println();
		return count;
	}
	
	public void dayOfTheWeek() throws NumberFormatException, IOException {
		
		System.out.println("add num of week day: (1-7)");
		
		int num = Integer.parseInt(bufferedReader.readLine());
		
		switch (num) {
		case 1:
			System.out.println("Monday, Понеділок, Понедельник");
			break;
		case 2:
			System.out.println("Tuesday, Вівторок, Вторник");
			break;
		case 3:
			System.out.println("Wednesday, Середа, Среда");
			break;
		case 4:
			System.out.println("Thursday, Четвер, Четверг");
			break;
		case 5:
			System.out.println("Friday, Пятниця, Пятница");
			break;
		case 6:
			System.out.println("Saturday, Субота, Субота");
			break;
		case 7:
			System.out.println("Sunday, Неділя, Воскресение");
		default:
			System.out.println("wrong num!");
			break;
		}
	}
}
