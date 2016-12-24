package HomeWork5;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int prod = 1;
		System.out.println("Enter number");
		
		int num = s.nextInt();
		while (num >=0 ){
			if (num % 2 == 0) {
				prod *= num;
			}
			num = s.nextInt();
		}
		
		System.out.println("Produkt of all even numbers: " + prod);
		s.close();

	}

}
