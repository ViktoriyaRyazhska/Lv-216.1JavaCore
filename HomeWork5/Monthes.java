package HomeWork5;

import java.util.Scanner;

public class Monthes {

	public static void main(String[] args) {
		int[] month_days  = {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31} ;
		
		Scanner s = new Scanner(System.in);
		int num_month = 0; 
		do {
			System.out.println("Enter number of month");
			num_month = s.nextInt();
		} while (num_month < 1 || num_month > 12);
		
		
		
		
		System.out.println("The amount days of month " + num_month + " is: " + month_days[num_month - 1]);
		
		s.close();
	}

}
