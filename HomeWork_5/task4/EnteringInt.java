package task4;

import java.util.Scanner;

public class EnteringInt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int productNum = 1;
		int enterNumbrer;

		do {
			enterNumbrer = sc.nextInt();
			if (enterNumbrer < 0) {
				break;
			}
			if (enterNumbrer % 2 == 0) {
				productNum *= enterNumbrer;
			}
		} while (true);
		sc.close();
		System.out.println("Product of all even entered numbers : " + productNum);

	}

}
