package HW4.T4;

import java.util.Scanner;

public class Enter {
	Scanner sc = new Scanner(System.in);

	public int enter() {
		int summ = 0;
		int index = 1;
		int temp = 0;
		do {
			temp = sc.nextInt();
			if (index % 2 == 0&& temp>=0) {

				summ *= temp;
			}
		} while (temp >= 0);
		sc.close();
		return summ;
	}
	
}