package homeworks.day5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int product = 1;
	int sum = 0;
	int mas[];
	mas = new int[10];
	System.out.println("Enter 10 int numbers");
	for (int i = 0; i < 10; i++) {
	    mas[i] = sc.nextInt();
	}

	for (int i = 0; i < 5; i++) {
	    if (mas[i] > 0) {
		if (i < 4) {
		    continue;
		} else {
		    for (int j = 0; j < 5; j++) {
			sum += mas[j];
		    }
		    System.out.println("Sum is " + sum);
			break;
		}
	    } else {
		for (int j = 5; j < 10; j++) {
		    product *= mas[j];
		}
		System.out.println("Product is " + product);
		break;
	    }
	}

    }

}
