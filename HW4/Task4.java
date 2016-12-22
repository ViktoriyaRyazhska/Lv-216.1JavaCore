package homeworks.day5;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int product = 1;
	int mas[];
	mas = new int[100];
	for (int i = 0; i < mas.length; i++) {
	    mas[i] = sc.nextInt();
	    if (mas[i] > 0) {
		continue;
	    } else {
		for (int j = 0; j <= i-1; j++) {
		    if (mas[j] % 2 == 0) {
			product *= mas[j];
		    } else {
			continue;
		    }
		}
		System.out.println("Product of all entered even numbers " + product);
		break;
	    }

	}
    }
}
